package main.java.com.eliabe.bible.infrastructure.importer;

import main.java.com.eliabe.bible.domain.model.Bible;
import main.java.com.eliabe.bible.domain.model.Verse;

import java.io.BufferedReader;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.LinkedHashSet;
import java.util.Set;

public class BibleFileImporter {
    public static Set<Verse> readFromTxtFile(String filePath) {
        Path path = Path.of(filePath);
        Set<Verse> veses = new LinkedHashSet<>();
        try (BufferedReader reader = Files.newBufferedReader(Path.of(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                int number = line.charAt(0);
                String text = line.substring(2);
                veses.add(new Verse(number,text));
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return veses;
    }
}
