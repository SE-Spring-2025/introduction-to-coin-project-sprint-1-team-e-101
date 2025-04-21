import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CuproNickelTest {
    @Test
    void testSmelt() {
        assertEquals("Cupro-Nickel", new CuproNickel().smelt());
    }
}
