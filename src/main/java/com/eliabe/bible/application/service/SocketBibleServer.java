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
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SocketBibleServer {

    public static void startServer() throws IOException {

        ExecutorService executorService = Executors.newFixedThreadPool(50);
            try (ServerSocket serverSocket = new ServerSocket(8000)) {
                System.out.println("Socket Bible Server started on port 8000");
                while (true) {
                    Socket clientSocket = serverSocket.accept();
                    executorService.execute(() -> requestSolver(clientSocket));
                }
        }
    }

    private static void requestSolver(Socket clientSocket) {
        try (clientSocket) {
            System.out.println("Client connected: " + clientSocket.getInetAddress());
            InputStream clientInputStream = clientSocket.getInputStream();
            StringBuilder requestBuilder = new StringBuilder();
            int data;
            do {
                data = clientInputStream.read();
                requestBuilder.append((char) data);
            } while (clientInputStream.available() > 0);
            String request = requestBuilder.toString();
            System.out.println("Received request: " + request);

            Thread.sleep(250); // Simulate processing delay
            String json = getJsonFile();

            OutputStream clienOutputStream = clientSocket.getOutputStream();
            PrintStream serverOutput = new PrintStream(clienOutputStream);
            serverOutput.println("HTTP/1.1 200 OK");
            serverOutput.println("Content-Type: application/json; charset=UTF-8");
            serverOutput.println();
            serverOutput.println(json);
        } catch (IOException | InterruptedException e) {
            System.out.println("Error handling client request: " + e.getMessage());
            throw new RuntimeException(e);
        }
    }

    private static String getJsonFile() {
        try {
            return Files.readString(Path.of(
                    "src/main/resources/jsonresourcesbible_export.json"));
        } catch (IOException e) {
            return createNewBible();
        }
    }

    public static String createNewBible() {
        Set<Verse> verses = BibleFileImporter.readFromTxtFile("src/main/resources/genesys1.txt");
        Chapter genesysChapter1 = new Chapter(1, verses);
        Book bookGenesys = new Book(
                "Gênesis",
                1,
                "Gen",
                new LinkedHashSet<Chapter>(List.of(genesysChapter1)));
        Bible bible = new Bible(
                "Portuguese",
                "Almeida Revista e Atualizada",
                "Source Info",
                "2024-06-01T12:00:00Z",
                new LinkedHashSet<Book>(List.of(bookGenesys)));
        return JsonExporter.exportToJson(bible);
    }
}