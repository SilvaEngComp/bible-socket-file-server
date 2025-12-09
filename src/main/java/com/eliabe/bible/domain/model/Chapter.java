package com.eliabe.bible.domain.model;

import java.util.Set;

public record Chapter (
    int number,
    Set<Verse> verses){
}

