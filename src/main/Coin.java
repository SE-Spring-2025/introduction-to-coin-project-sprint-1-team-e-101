
import java.text.DecimalFormat;

public abstract class Coin {
	public static final double PENNY_VALUE = 0.01;
	public static final double NICKEL_VALUE = 0.05;
	public static final double DIME_VALUE = 0.10;
	public static final double QUARTER_VALUE = 0.25;
	public static final double HALFDOLLAR_VALUE = 0.50;
	public static final double DOLLAR_VALUE = 1.00;

	private final String familiarName;
	private final double value;
	private final String frontMotto;
	private final String backMotto;
	private final String frontLabel;
	private final String backLabel;
	private final String frontImage;
	private final String backImage;
	private final String valueDescription;
	private final boolean ridgedEdge;
	private final Metallurgy metallurgy;
	private final int manufactureYear;

	// Flags for manufacturing steps
	private boolean flipped = false;
	private boolean buffed = false;

	// Counts dashboard (now private)
	private static final CoinCounts COUNTS = new CoinCounts();

	protected Coin(
			String familiarName,
			double value,
			String frontMotto,
			String backMotto,
			String frontLabel,
			String backLabel,
			String frontImage,
			String backImage,
			String valueDescription,
			boolean ridgedEdge,
			Metallurgy metallurgy,
			int manufactureYear) {
		this.familiarName = familiarName;
		this.value = value;
		this.frontMotto = frontMotto;
		this.backMotto = backMotto;
		this.frontLabel = frontLabel;
		this.backLabel = backLabel;
		this.frontImage = frontImage;
		this.backImage = backImage;
		this.valueDescription = valueDescription;
		this.ridgedEdge = ridgedEdge;
		this.metallurgy = metallurgy;
		this.manufactureYear = manufactureYear;
		COUNTS.increment(familiarName);
	}

	// --- Template method ---
	/** Runs the full manufacturing workflow on the given “blob.” */
	public final Coin manufacture(Coin c0) {
		Coin c1 = smelt(c0);
		Coin c2 = ridge(c1);
		Coin c3 = imprintFrontImage(c2);
		Coin c4 = imprintFrontMotto(c3);
		Coin c5 = flip(c4);
		Coin c6 = imprintBackImage(c5);
		Coin c7 = imprintBackMotto(c6);
		Coin c8 = buff(c7);
		return c8;
	}

	// --- Abstract steps for subclasses ---
	protected abstract Coin smelt(Coin in);

	protected abstract Coin ridge(Coin in);

	protected abstract Coin imprintFrontImage(Coin in);

	protected abstract Coin imprintFrontMotto(Coin in);

	protected abstract Coin imprintBackImage(Coin in);

	protected abstract Coin imprintBackMotto(Coin in);

	// --- Default concrete steps ---
	protected final Coin flip(Coin in) {
		in.flipped = true;
		System.out.println("🔄 Flipped the coin.");
		return in;
	}

	protected final Coin buff(Coin in) {
		in.buffed = true;
		System.out.println("✨ Buffed the coin to smooth finish.");
		return in;
	}

	// --- Getters for flags & metadata ---
	public boolean isFlipped() {
		return flipped;
	}

	public boolean isBuffed() {
		return buffed;
	}

	public String getFamiliarName() {
		return familiarName;
	}

	public double getValue() {
		return value;
	}

	public String getFrontMotto() {
		return frontMotto;
	}

	public String getBackMotto() {
		return backMotto;
	}

	public String getFrontLabel() {
		return frontLabel;
	}

	public String getBackLabel() {
		return backLabel;
	}

	public String getFrontImage() {
		return frontImage;
	}

	public String getBackImage() {
		return backImage;
	}

	public String getValueDescription() {
		return valueDescription;
	}

	public boolean hasRidgedEdge() {
		return ridgedEdge;
	}

	public String getMetallurgy() {
		return metallurgy.smelt();
	}

	public int getYear() {
		return manufactureYear;
	}

	public static CoinCounts getCoinCounts() {
		return COUNTS;
	}

	@Override
	public String toString() {
		DecimalFormat df = new DecimalFormat("0.00");
		return String.format(
				"[%s, %s, %d, '%s', '%s', '%s', '%s', '%s', '%s', %s, '%s', flipped=%b, buffed=%b]",
				familiarName,
				df.format(value),
				manufactureYear,
				frontMotto,
				backMotto,
				frontImage,
				backImage,
				frontLabel,
				backLabel,
				valueDescription,
				ridgedEdge ? "ridges" : "smooth",
				getMetallurgy(),
				flipped,
				buffed);
	}
}
