
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class DimeCustomSmelterTest {
    @Test
    void testCustomSmelterConstructor() {
        Metallurgy testAlloy = () -> "Test‑Alloy";
        int year = 2025;

        Dime d = new Dime(testAlloy, year);
        assertEquals("Dime", d.getFamiliarName());
        assertEquals(Coin.DIME_VALUE, d.getValue());
        assertEquals("Test‑Alloy", d.getMetallurgy());
        assertEquals(year, d.getYear());
    }
}
