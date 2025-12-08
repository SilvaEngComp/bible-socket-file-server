
package main.java.com.eliabe.bible.domain.model;

import java.util.ArrayList;
import java.util.List;

public class Bible {
    private String language;
    private String version;
    private String source;
    private String fetchedAt;
    private List<Book> books = new ArrayList<>();

    public Bible() {}

    public Bible(String language, String version, String source, String fetchedAt) {
        this.language = language;
        this.version = version;
        this.source = source;
        this.fetchedAt = fetchedAt;
    }

    public String getLanguage() { return language; }
    public void setLanguage(String language) { this.language = language; }

    public String getVersion() { return version; }
    public void setVersion(String version) { this.version = version; }

    public String getSource() { return source; }
    public void setSource(String source) { this.source = source; }

    public String getFetchedAt() { return fetchedAt; }
    public void setFetchedAt(String fetchedAt) { this.fetchedAt = fetchedAt; }

    public List<Book> getBooks() { return books; }
    public void setBooks(List<Book> books) { this.books = books; }
}
