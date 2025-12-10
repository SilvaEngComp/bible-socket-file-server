package com.eliabe.bible.application.service;

import com.sun.net.httpserver.Headers;
import com.sun.net.httpserver.HttpServer;

import java.io.IOException;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.nio.file.Files;
import java.nio.file.Path;

public class SocketBibleServer {

    public static void startServer()  throws IOException {
        InetSocketAddress initSocketServer = new InetSocketAddress(8000);
        HttpServer httpServer = HttpServer.create(initSocketServer,0);
    httpServer.createContext("/bible",exchange -> {
        String json = Files.readString(Path.of("C:\\_1\\Estudo Java\\demo\\bible-socket-service\\src\\main\\resources\\jsonresourcesbible_export.json"));
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
}
