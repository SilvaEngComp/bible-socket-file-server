package com.eliabe.bible.application.service;

import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class BibleClient {
   public static void clientCall() throws Exception{
       URI uri = URI.create("http://localhost:8000/bible");

       try(HttpClient httpClient = HttpClient.newHttpClient()){
           HttpRequest httpRequest = HttpRequest.newBuilder(uri).build();
           HttpResponse<String> httpResponse = httpClient.send(httpRequest,HttpResponse.BodyHandlers.ofString());
           int statusCode = httpResponse.statusCode();
           String responseBody = httpResponse.body();
           System.out.println(statusCode);
           System.out.println(responseBody);
       }
   }
}
