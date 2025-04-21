import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CopperTest {
    @Test
    void testSmelt() {
        assertEquals("Copper", new Copper().smelt());
    }
}
