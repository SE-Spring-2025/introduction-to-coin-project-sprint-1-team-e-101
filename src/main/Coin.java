import java.text.DecimalFormat;

public abstract class Coin {
    public static final double PENNY_VALUE = 0.01;
    public static final double NICKEL_VALUE = 0.05;
    public static final double DIME_VALUE = 0.10;
    public static final double QUARTER_VALUE = 0.25;
    public static final double HALFDOLLAR_VALUE = 0.50;
    public static final double DOLLAR_VALUE = 1.00;

    // Instance variables defining various properties of a coin.
    private String familiarName;
    private double value;
    private String frontMotto;
    private String backMotto;
    private String frontLabel;
    private String backLabel;
    private String frontImage;
    private String backImage;
    private String valueDescription;
    private boolean ridgedEdge;
    private String metallurgy;
    private int manufactureYear;
    private Metallurgy delegator;
    
    public Coin(String familiarName, double value, String frontMotto, String backMotto, String frontLabel, 
		String backLabel, String frontImage, String backImage, String valueDescription, boolean ridgedEdge, 
		String metallurgy, Metallurgy delegate, int manufactureYear)
	{
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
        this.delegator = delegator;
		this.manufactureYear = manufactureYear;
    }

    public void smelt()
    {
        this.metallurgy = delegator.smelt();
    }
    
    // Getter methods for accessing the coin's properties.
    
    /**
     * @return the familiar name of the coin (e.g., "Penny", "Nickel").
     */
    public String getFamiliarName() {
        return familiarName;
    }
    
    /**
     * @return the monetary value of the coin.
     */
    public double getValue() {
        return value;
    }
    
    /**
     * @return the motto on the front side of the coin.
     */
    public String getFrontMotto() {
        return frontMotto;
    }
    
    /**
     * @return the motto on the back side of the coin.
     */
    public String getBackMotto() {
        return backMotto;
    }
    
    /**
     * @return the label on the front side of the coin.
     */
    public String getFrontLabel() {
        return frontLabel;
    }
    
    /**
     * @return the label on the back side of the coin.
     */
    public String getBackLabel() {
        return backLabel;
    }
    
    /**
     * @return the identifier for the front image of the coin.
     */
    public String getFrontImage() {
        return frontImage;
    }
    
    /**
     * @return the identifier for the back image of the coin.
     */
    public String getBackImage() {
        return backImage;
    }
    
    /**
     * @return a description of the coin's monetary value.
     */
    public String getValueDescription() {
        return valueDescription;
    }
    
    /**
     * @return true if the coin has a ridged edge; false if the edge is smooth.
     */
    public boolean getRidgedEdge() {
        return ridgedEdge;
    }
    
    /**
     * @return the metallurgy of the coin (e.g., "Copper", "Cupro-Nickel").
     */
    public String getMetallurgy() {
        return metallurgy;
    }
    
    /**
     * @return the manufacturing year of the coin.
     */
    public int getYear() {
        return manufactureYear;
    }
    
    /**
     * Returns a string representation of the coin, including its properties such as name,
     * value, manufacture year, mottos, images, labels, value description, edge type, and metallurgy.
     *
     * @return a string describing the coin.
     */
    public String toString() {
        // Format the coin's value to two decimal places.
        DecimalFormat df = new DecimalFormat("0.00");
        String formattedValue = df.format(value);
        
        // Construct and return the string representation of the coin.
        return "[" + familiarName
            + "," + formattedValue
            + "," + manufactureYear
            + ",'" + frontMotto
            + "','" + backMotto
            + "','" + frontImage
            + "','" + backImage
            + "','" + frontLabel
            + "','" + backLabel
            + "','" + valueDescription
            + "'," + (ridgedEdge ? "ridges" : "smooth")
            + ",'" + metallurgy
            + "']";
    }
}
