package main.java.com.eliabe.bible.domain.model;

import java.util.List;
import java.util.Set;

public record Book(
    String name,
    Integer position,
    String abbreviation,
    Set<Chapter> chapters){


}

