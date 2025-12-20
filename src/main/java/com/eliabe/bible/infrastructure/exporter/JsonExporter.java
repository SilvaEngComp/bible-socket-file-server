package com.eliabe.bible.infrastructure.exporter;

import com.eliabe.bible.domain.model.Bible;
import com.google.gson.Gson;

import java.io.BufferedWriter;
import java.io.FileWriter;

public class JsonExporter {
    public static String exportToJson(Bible bible) {
      Gson gson = new Gson();
      String fileName = "src/main/resources/jsonresourcesbible_export.json";
      try(var writer = new BufferedWriter(new FileWriter(fileName))) {
          String json = gson.toJson(bible);
          writer.write(json);
      } catch (Exception e) {
          e.printStackTrace();
      }
      return gson.toJson(bible);
    }
}

