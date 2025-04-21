
// DollarTest.java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DollarTest {

    @Test
    void testConstructorWithYear() {
        int year = 1885;
        Dollar dl = new Dollar(year);

        assertEquals("Dollar", dl.getFamiliarName());
        assertEquals(Coin.DOLLAR_VALUE, dl.getValue());
        assertEquals("IN GOD WE TRUST", dl.getFrontMotto());
        assertEquals("E PLURIBUS UNUM", dl.getBackMotto());
        assertEquals("LIBERTY", dl.getFrontLabel());
        assertEquals("UNITED STATES OF AMERICA", dl.getBackLabel());
        assertEquals("S_Anthony", dl.getFrontImage());
        assertEquals("Moon_Eagle", dl.getBackImage());
        assertEquals("ONE DOLLAR", dl.getValueDescription());
        assertTrue(dl.hasRidgedEdge());
        assertEquals("Cupro-Nickel", dl.getMetallurgy());
        assertEquals(year, dl.getYear());
    }
}
