import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class QuarterTest {

    @Test
    void testConstructorWithYear() {
        int year = 1999;
        Quarter q = new Quarter(year);

        assertEquals("Quarter", q.getFamiliarName());
        assertEquals(Coin.QUARTER_VALUE, q.getValue());
        assertEquals("IN GOD WE TRUST", q.getFrontMotto());
        assertEquals("E PLURIBUS UNUM", q.getBackMotto());
        assertEquals("LIBERTY", q.getFrontLabel());
        assertEquals("UNITED STATES OF AMERICA", q.getBackLabel());
        assertEquals("G_Washington", q.getFrontImage());
        assertEquals("Eagle", q.getBackImage());
        assertEquals("QUARTER DOLLAR", q.getValueDescription());
        assertTrue(q.hasRidgedEdge());
        assertEquals("Cupro-Nickel", q.getMetallurgy());
        assertEquals(year, q.getYear());
    }
}
