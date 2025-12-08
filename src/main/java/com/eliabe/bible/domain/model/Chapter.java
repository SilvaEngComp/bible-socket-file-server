package main.java.com.eliabe.bible.domain.model;

import java.util.List;

public class Chapter {
    private final int number;
    private final List<Verse> verses;

    public Chapter(int number, List<Verse> verses) {
        this.number = number;
        this.verses = verses;
    }

    public int getNumber() {
        return number;
    }

    public List<Verse> getVerses() {
        return verses;
    }
}

