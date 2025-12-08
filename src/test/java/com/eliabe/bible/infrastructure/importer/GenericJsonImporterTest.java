package test.java.com.eliabe.bible.infrastructure.importer;

import main.java.com.eliabe.bible.domain.model.Bible;
import main.java.com.eliabe.bible.infrastructure.importer.GenericJsonImporter;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class GenericJsonImporterTest {
    @Test
    public void testImportFromJsonReturnsNullForStub() {
        GenericJsonImporter importer = new GenericJsonImporter();
        Bible bible = importer.importFromJson("sample.json");
        assertNull(bible); // Stub implementation returns null
    }
}

