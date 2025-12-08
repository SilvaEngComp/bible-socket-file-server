package main.java.com.eliabe.bible.application;

import main.java.com.eliabe.bible.domain.model.Book;

import java.util.HashMap;
import java.util.Map;

public class BibleIndex {
    private final Map<String, Book> bookIndex = new HashMap<>();
    // Add more indexes as needed

    public void addBook(Book book) {
        bookIndex.put(book.getAbbreviation(), book);
    }

    public Book getBook(String abbrev) {
        return bookIndex.get(abbrev);
    }

    // Add chapter/verse lookup methods as needed
}

