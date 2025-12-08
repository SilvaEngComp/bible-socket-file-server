package main.java.com.eliabe.bible.domain;

import java.util.Map;
import java.util.HashMap;

public class Canon {
    public static final Map<String, String> ABBREV = new HashMap<>();
    static {
        ABBREV.put("Genesis", "gn");
        ABBREV.put("Exodus", "ex");
        // ... add more canonical abbreviations as needed
    }
}

