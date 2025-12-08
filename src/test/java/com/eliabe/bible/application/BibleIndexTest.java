package test.java.com.eliabe.bible.application;

import main.java.com.eliabe.bible.application.BibleIndex;
import main.java.com.eliabe.bible.domain.model.Book;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class BibleIndexTest {
    @Test
    public void testAddAndGetBook() {
        BibleIndex index = new BibleIndex();
        Book book = new Book("Genesis",1, "gn", null);
        index.addBook(book);
        assertEquals(book, index.getBook("gn"));
    }
}

