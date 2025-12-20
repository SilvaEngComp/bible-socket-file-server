
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
    }
}