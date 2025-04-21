
// CoinCountsTest.java
import org.junit.jupiter.api.*;
import static org.junit.jupiter.api.Assertions.*;
import java.util.concurrent.atomic.AtomicBoolean;

class CoinCountsTest {
    @Test
    void testBasicCounting() {
        CoinCounts c = new CoinCounts();
        c.increment("Penny");
        assertEquals(1, c.getTotalCoins());
        assertEquals(0, c.getQuarterCount());

        c.increment("Quarter");
        assertEquals(2, c.getTotalCoins());
        assertEquals(1, c.getQuarterCount());
    }

    @Test
    void testObserverNotified() {
        CoinCounts c = new CoinCounts();
        AtomicBoolean notified = new AtomicBoolean(false);
        c.addObserver(() -> notified.set(true));
        c.increment("Dime");
        assertTrue(notified.get(), "Observer should have been notified upon increment");
    }
}
