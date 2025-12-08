package main.java.com.eliabe.bible.domain.model;

import java.util.List;

public record Book(
    String name,
    Integer position,
    String abbreviation,
    List<Chapter> chapters){


}

