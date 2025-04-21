import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CoinTest {

	private final Coin testCoin = new MockCoin();

	// a minimal concrete subclass so we can instantiate Coin
	private static class MockCoin extends Coin {
		public MockCoin() {
			super(
					"Mock", // familiarName
					24.0, // value
					"frontMotto", // frontMotto
					"backMotto", // backMotto
					"frontLabel", // frontLabel
					"backLabel", // backLabel
					"frontImage", // frontImage
					"backImage", // backImage
					"twenty‑four cents", // valueDescription
					false, // ridgedEdge
					new Metallurgy() { // metallurgy
						@Override
						public String smelt() {
							return "metallurgy";
						}
					},
					1788 // manufactureYear
			);
		}

		@Override
		protected Coin smelt(Coin in) {
			return in;
		}

		@Override
		protected Coin ridge(Coin in) {
			return in;
		}

		@Override
		protected Coin imprintFrontImage(Coin in) {
			return in;
		}

		@Override
		protected Coin imprintFrontMotto(Coin in) {
			return in;
		}

		@Override
		protected Coin imprintBackImage(Coin in) {
			return in;
		}

		@Override
		protected Coin imprintBackMotto(Coin in) {
			return in;
		}
	}

	@Test
	void testGetters() {
		assertEquals("Mock", testCoin.getFamiliarName());
		assertEquals(24.0, testCoin.getValue());
		assertEquals("frontMotto", testCoin.getFrontMotto());
		assertEquals("backMotto", testCoin.getBackMotto());
		assertEquals("frontLabel", testCoin.getFrontLabel());
		assertEquals("backLabel", testCoin.getBackLabel());
		assertEquals("frontImage", testCoin.getFrontImage());
		assertEquals("backImage", testCoin.getBackImage());
		assertEquals("twenty‑four cents", testCoin.getValueDescription());
		assertFalse(testCoin.hasRidgedEdge());
		assertEquals("metallurgy", testCoin.getMetallurgy());
		assertEquals(1788, testCoin.getYear());
	}

	@Test
	void testFlagsBeforeManufacture() {
		// Before calling manufacture, flags should be false
		assertFalse(testCoin.isFlipped(), "should start unflipped");
		assertFalse(testCoin.isBuffed(), "should start unbuffed");
	}

	@Test
	void testManufactureSetsFlags() {
		// manufacture(...) should return the same instance
		Coin result = testCoin.manufacture(testCoin);
		assertSame(testCoin, result, "manufacture should return the same coin instance");

		// After manufacturing, both flags must be true
		assertTrue(testCoin.isFlipped(), "manufacture must flip the coin");
		assertTrue(testCoin.isBuffed(), "manufacture must buff the coin");
	}
}
