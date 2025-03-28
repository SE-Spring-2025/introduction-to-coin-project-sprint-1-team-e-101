import java.text.DecimalFormat;

public abstract class Coin {
    public static final double PENNY_VALUE = 0.01;
    public static final double NICKEL_VALUE = 0.05;
    public static final double DIME_VALUE = 0.10;
    public static final double QUARTER_VALUE = 0.25;
    public static final double HALFDOLLAR_VALUE = 0.50;
    public static final double DOLLAR_VALUE = 1.00;
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
    
    public Coin(String familiarName, double value, String frontMotto, String backMotto, String frontLabel, 
		String backLabel, String frontImage, String backImage, String valueDescription, boolean ridgedEdge, 
		String metallurgy, int manufactureYear)
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
		this.manufactureYear = manufactureYear;
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
    public boolean getRidgedEdge() {
	return ridgedEdge;
    }
    public String getMetallurgy() {
	return metallurgy;
    }
    public int getYear() {
	return manufactureYear;
    }

    public String toString() {
	DecimalFormat df = new DecimalFormat("0.00");
        String formattedValue = df.format(value);
	
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
