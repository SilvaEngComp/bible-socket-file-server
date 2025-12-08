package main.java.com.eliabe.bible.domain.model;

public class Verse {
    private final int number;
    private final String text;

    public Verse(int number, String text) {
        this.number = number;
        this.text = text;
    }

    public int getNumber() {
        return number;
    }

    public String getText() {
        return text;
    }
}

