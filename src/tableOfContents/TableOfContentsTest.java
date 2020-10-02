package tableOfContents;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TableOfContentsTest {

    private TableOfContents toc;

    @BeforeEach
    public void setUp() {
        this.toc = new TableOfContents();
    }

    @DisplayName("Testet alle Fälle, in denen Überschrift und Seitenzahl in eine Zeile passen")
    @ParameterizedTest(name = "heading={0}, page ={1}, result={2}")
    @CsvSource(value = {"turtle, 34, turtle..........................................34",
            "2.1 Alphanumerische Zeichen, 110, 2.1 Alphanumerische Zeichen....................110"})
    public void givenCompatibleHeading_WhenCreateEntry_ThenReturnEntryString(String heading, String page, String result) {
        assertEquals(result, toc.createEntry(heading, page));
    }

    public void givenNotCompatibleHeading_WhenCreateEntry_ThenReturnEmptyString() {
        assertEquals("", toc.createEntry("Lorem ipsum dolor sit amet, consetetur sadipscing elitr, sed diam nonumy eirmod  tempor invidunt ut labore", "34"));
    }
}
