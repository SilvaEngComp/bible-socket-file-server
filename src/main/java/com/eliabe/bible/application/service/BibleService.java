package com.eliabe.bible.application.service;


import com.eliabe.bible.domain.ReferenceParser;
import com.eliabe.bible.domain.model.Bible;

public class BibleService {
    private final Bible bible;

    public BibleService(Bible bible) {
        this.bible = bible;
    }

    // Example method for lookup
    public String lookupVerse(String referenceText) {
        ReferenceParser parser = new ReferenceParser();
        ReferenceParser.Reference ref = parser.parse(referenceText);
        if (ref == null) return null;
        // Lookup logic would go here
        return "Verse text for " + referenceText;
    }

}

