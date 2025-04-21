import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CoinTest {

	private final Coin testCoin = new MockCoin();

	// a tiny concrete subclass so we can instantiate Coin
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
}
