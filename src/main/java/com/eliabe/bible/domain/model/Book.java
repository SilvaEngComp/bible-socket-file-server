package main.java.com.eliabe.bible.domain.model;

import java.util.List;

public class Book {
    private final String name;
    private final String abbreviation;
    private final List<Chapter> chapters;

    public Book(String name, String abbreviation, List<Chapter> chapters) {
        this.name = name;
        this.abbreviation = abbreviation;
        this.chapters = chapters;
    }

    public String getName() {
        return name;
    }

    public String getAbbreviation() {
        return abbreviation;
    }

    public List<Chapter> getChapters() {
        return chapters;
    }
}

