
// PennyTest.java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PennyTest {

    @Test
    void testConstructorWithYear() {
        int year = 2021;
        Penny p = new Penny(year);

        assertEquals("Penny", p.getFamiliarName());
        assertEquals(Coin.PENNY_VALUE, p.getValue());
        assertEquals("IN GOD WE TRUST", p.getFrontMotto());
        assertEquals("E PLURIBUS UNUM", p.getBackMotto());
        assertEquals("LIBERTY", p.getFrontLabel());
        assertEquals("UNITED STATES OF AMERICA", p.getBackLabel());
        assertEquals("A_Lincoln", p.getFrontImage());
        assertEquals("Lincoln_Memorial", p.getBackImage());
        assertEquals("ONE CENT", p.getValueDescription());
        assertFalse(p.hasRidgedEdge());
        assertEquals("Copper", p.getMetallurgy());
        assertEquals(year, p.getYear());
    }
}
