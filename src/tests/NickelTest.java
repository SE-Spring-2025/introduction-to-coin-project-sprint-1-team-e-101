
// NickelTest.java
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class NickelTest {

    @Test
    void testConstructorWithYear() {
        int year = 2005;
        Nickel n = new Nickel(year);

        assertEquals("Nickel", n.getFamiliarName());
        assertEquals(Coin.NICKEL_VALUE, n.getValue());
        assertEquals("IN GOD WE TRUST", n.getFrontMotto());
        assertEquals("E PLURIBUS UNUM", n.getBackMotto());
        assertEquals("LIBERTY", n.getFrontLabel());
        assertEquals("UNITED STATES OF AMERICA", n.getBackLabel());
        assertEquals("T_Jefferson", n.getFrontImage());
        assertEquals("Jefferson_Memorial", n.getBackImage());
        assertEquals("FIVE CENTS", n.getValueDescription());
        assertFalse(n.hasRidgedEdge());
        assertEquals("Cupro-Nickel", n.getMetallurgy());
        assertEquals(year, n.getYear());
    }
}
