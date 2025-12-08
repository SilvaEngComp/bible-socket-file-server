package main.java.com.eliabe.bible.domain.model;

import java.util.List;
import java.util.Set;

public record Chapter (
    int number,
    Set<Verse> verses){
}

