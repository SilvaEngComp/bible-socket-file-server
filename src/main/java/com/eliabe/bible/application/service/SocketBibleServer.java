package com.eliabe.bible.application.service;

import com.eliabe.bible.domain.model.Bible;
import com.eliabe.bible.domain.model.Book;
import com.eliabe.bible.domain.model.Chapter;
import com.eliabe.bible.domain.model.Verse;
import com.eliabe.bible.infrastructure.exporter.JsonExporter;
import com.eliabe.bible.infrastructure.importer.BibleFileImporter;
import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

public class SocketBibleServer {

    public static void startServer()  throws IOException {
        InetSocketAddress initSocketServer = new InetSocketAddress(8000);
        HttpServer httpServer = HttpServer.create(initSocketServer,0);
    httpServer.createContext("/bible",exchange -> {
        String json = getJsonFile();
        byte[] bytes = json.getBytes();

        Headers responseHeaders = exchange.getResponseHeaders();
        responseHeaders.add("Content-Type","application/json");

        exchange.sendResponseHeaders(200,bytes.length);


        OutputStream responseBody = exchange.getResponseBody();
        responseBody.write(bytes);
    });
        System.out.println("Server started on port 8080");
        httpServer.start();
}

private static String getJsonFile(){
    try{
        return Files.readString(Path.of("C:\\_1\\Estudo Java\\demo\\bible-socket-service\\src\\main\\resources\\jsonresourcesbible_export.json"));
    }catch (IOException e){
       return createNewBible();
    }
}


public static String createNewBible(){
    Set<Verse> verses = BibleFileImporter.readFromTxtFile("src/main/resources/genesys1.txt");
       Chapter genesysChapter1 = new Chapter(1,verses);
       Book bookGenesys = new Book(
               "Gênesis",
               1,
               "Gen",
               new LinkedHashSet<Chapter>(List.of(genesysChapter1))
       );
       Bible bible = new Bible(
               "Portuguese",
               "Almeida Revista e Atualizada",
               "Source Info",
               "2024-06-01T12:00:00Z",
               new LinkedHashSet<Book>(List.of(bookGenesys))
       );
       return JsonExporter.exportToJson(bible);
}
}