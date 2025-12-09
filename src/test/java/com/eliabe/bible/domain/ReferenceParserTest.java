package com.eliabe.bible.domain;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;


public class ReferenceParserTest {

    @Test
    public void testParseInvalidReference() {
        ReferenceParser parser = new ReferenceParser();
        ReferenceParser.Reference ref = parser.parse("Invalid");

        assertNull(ref);
    }

    @Test
    public void testParseValidReference() {
        ReferenceParser parser = new ReferenceParser();
        ReferenceParser.Reference ref = parser.parse("Gn 1:1");
        assertEquals(1, ref.verse);
        assertEquals(1, ref.chapter);
        assertEquals("gn", ref.bookAbbrev);
        assertNotNull(ref);
    }
}



