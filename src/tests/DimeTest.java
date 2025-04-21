
// DimeTest.java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DimeTest {

    @Test
    void testConstructorWithYear() {
        int year = 2010;
        Dime d = new Dime(year);

        assertEquals("Dime", d.getFamiliarName());
        assertEquals(Coin.DIME_VALUE, d.getValue());
        assertEquals("IN GOD WE TRUST", d.getFrontMotto());
        assertEquals("E PLURIBUS UNUM", d.getBackMotto());
        assertEquals("LIBERTY", d.getFrontLabel());
        assertEquals("UNITED STATES OF AMERICA", d.getBackLabel());
        assertEquals("F_Roosevelt", d.getFrontImage());
        assertEquals("Torch_Branches", d.getBackImage());
        assertEquals("ONE DIME", d.getValueDescription());
        assertTrue(d.hasRidgedEdge());
        assertEquals("Cupro-Nickel", d.getMetallurgy());
        assertEquals(year, d.getYear());
    }
}
