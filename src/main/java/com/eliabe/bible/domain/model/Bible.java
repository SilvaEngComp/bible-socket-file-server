
package main.java.com.eliabe.bible.domain.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public record Bible (
     String language,
     String version,
     String source,
     String fetchedAt,
     Set<Book> books){}


