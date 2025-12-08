
package main.java.com.eliabe.bible.domain.model;

import java.util.ArrayList;
import java.util.List;

public record Bible (
     String language,
     String version,
     String source,
     String fetchedAt,
     List<Book> books){}


