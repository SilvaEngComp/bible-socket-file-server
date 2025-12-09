package com.eliabe.bible.infrastructure.importer;


import com.eliabe.bible.domain.Util;
import com.eliabe.bible.domain.model.Verse;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashSet;
import java.util.Set;

public class BibleFileImporter {
    public static Set<Verse> readFromTxtFile(String filePath) {
        Set<Verse> veses = new LinkedHashSet<>();
        try (BufferedReader reader = Files.newBufferedReader(Path.of(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                Integer number = Util.strintgToInt(line.substring(0,1));
                String text = line.substring(2);
                veses.add(new Verse(number,text));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return veses;
    }
}
