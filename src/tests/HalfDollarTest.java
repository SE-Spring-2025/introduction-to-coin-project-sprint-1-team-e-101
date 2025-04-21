
// HalfDollarTest.java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class HalfDollarTest {

    @Test
    void testConstructorWithYear() {
        int year = 1964;
        HalfDollar hd = new HalfDollar(year);

        assertEquals("HalfDollar", hd.getFamiliarName());
        assertEquals(Coin.HALFDOLLAR_VALUE, hd.getValue());
        assertEquals("IN GOD WE TRUST", hd.getFrontMotto());
        assertEquals("E PLURIBUS UNUM", hd.getBackMotto());
        assertEquals("LIBERTY", hd.getFrontLabel());
        assertEquals("UNITED STATES OF AMERICA", hd.getBackLabel());
        assertEquals("J_Kennedy", hd.getFrontImage());
        assertEquals("Presidential_Seal", hd.getBackImage());
        assertEquals("HALF DOLLAR", hd.getValueDescription());
        assertTrue(hd.hasRidgedEdge());
        assertEquals("Cupro-Nickel", hd.getMetallurgy());
        assertEquals(year, hd.getYear());
    }
}
