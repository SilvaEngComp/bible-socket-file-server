
import com.eliabe.bible.application.service.BibleClient;
import com.eliabe.bible.application.service.SocketBibleServer;
import com.eliabe.bible.domain.model.Bible;
import com.eliabe.bible.domain.model.Book;
import com.eliabe.bible.domain.model.Chapter;
import com.eliabe.bible.domain.model.Verse;
import com.eliabe.bible.infrastructure.exporter.JsonExporter;
import com.eliabe.bible.infrastructure.importer.BibleFileImporter;

import java.io.IOException;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;

import static java.lang.Thread.sleep;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws Exception {
        SocketBibleServer.startServer();
        sleep(10);
        BibleClient.clientCall();
//        Set<Verse> verses = BibleFileImporter.readFromTxtFile("src/main/resources/genesys1.txt");
//        Chapter genesysChapter1 = new Chapter(1,verses);
//        Book bookGenesys = new Book(
//                "Gênesis",
//                1,
//                "Gen",
//                new LinkedHashSet<Chapter>(List.of(genesysChapter1))
//        );
//        Bible bible = new Bible(
//                "Portuguese",
//                "Almeida Revista e Atualizada",
//                "Source Info",
//                "2024-06-01T12:00:00Z",
//                new LinkedHashSet<Book>(List.of(bookGenesys))
//        );
//        System.out.println(JsonExporter.exportToJson(bible));
    }
}