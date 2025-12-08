package main.java.com.eliabe.bible.domain.model;

import java.util.List;

public record Chapter (
    int number,
     List<Verse> verses){
}

