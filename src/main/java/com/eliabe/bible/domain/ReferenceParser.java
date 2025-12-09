package com.eliabe.bible.domain;

public class ReferenceParser {
    public static class Reference {
        public final String bookAbbrev;
        public final int chapter;
        public final int verse;
        public Reference(String bookAbbrev, int chapter, int verse) {
            this.bookAbbrev = bookAbbrev;
            this.chapter = chapter;
            this.verse = verse;
        }
    }

    public Reference parse(String input) {
        // Example: "Gn 1:1" or "Genesis 1.1"
        // Minimal implementation for demonstration
        String[] parts = input.split("[ .:]");
        if (parts.length < 3) return null;
        String book = parts[0].toLowerCase();
        int chapter = Integer.parseInt(parts[1]);
        int verse = Integer.parseInt(parts[2]);
        return new Reference(book, chapter, verse);
    }
}

