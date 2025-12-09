package com.eliabe.bible.domain.model;

import java.util.Set;

public record Book(
    String name,
    Integer position,
    String abbreviation,
    Set<Chapter> chapters){


}

