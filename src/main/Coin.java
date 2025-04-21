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
	protected static final CoinCounts COUNTS = new CoinCounts(); // shared by all coins

	/**
	 * @param familiarName     e.g. "Quarter"
	 * @param value            e.g. 0.25
	 * @param frontMotto       e.g. "IN GOD WE TRUST"
	 * @param backMotto        e.g. "E PLURIBUS UNUM"
	 * @param frontLabel       e.g. "LIBERTY"
	 * @param backLabel        e.g. "UNITED STATES OF AMERICA"
	 * @param frontImage       e.g. "G_Washington"
	 * @param backImage        e.g. "Eagle"
	 * @param valueDescription e.g. "QUARTER DOLLAR"
	 * @param ridgedEdge       true if edge is ridged
	 * @param metallurgy       a Metallurgy implementation
	 * @param manufactureYear  year minted
	 */
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
		;
	}

	// --- getters ---
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
				"[%s, %s, %d, '%s', '%s', '%s', '%s', '%s', '%s', %s, '%s']",
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
				getMetallurgy());
	}
}
