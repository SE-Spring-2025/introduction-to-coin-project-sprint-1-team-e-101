import java.util.Calendar;
import java.text.DecimalFormat;

public class Coin {
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
    
    public Coin() {
	this(0);
    }
    public Coin(double value) {
	this(value, (Calendar.getInstance()).get(Calendar.YEAR));
    }
    public Coin(double value, int year) {

	if (cmpDoubles(value, PENNY_VALUE)) {
	    familiarName = "Penny";
	    frontImage = "A_Lincoln";
	    backImage = "Lincoln_Memorial";
	    valueDescription = "ONE CENT";
	    ridgedEdge = false;
	    metallurgy = "Copper";
	}
	else if (cmpDoubles(value, NICKEL_VALUE)) {
	    familiarName = "Nickel";
	    frontImage = "T_Jefferson";
	    backImage = "Jefferson_Memorial";
	    valueDescription = "FIVE CENTS";
	    ridgedEdge = false;
	    metallurgy = "Cupro-Nickel";
	}
	else if (cmpDoubles(value, DIME_VALUE)) {
	    familiarName = "Dime";
	    frontImage = "F_Roosevelt";
	    backImage = "Torch_Branches";
	    valueDescription = "ONE DIME";
	    ridgedEdge = true;
	    metallurgy = "Cupro-Nickel";
	}
	else if (cmpDoubles(value, QUARTER_VALUE)) {
	    familiarName = "Quarter";
	    frontImage = "G_Washington";
	    backImage = "Eagle";
	    valueDescription = "QUARTER DOLLAR";
	    ridgedEdge = true;
	    metallurgy = "Cupro-Nickel";
	}
	else if (cmpDoubles(value, HALFDOLLAR_VALUE)) {
	    familiarName = "HalfDollar";
	    frontImage = "J_Kennedy";
	    backImage = "Presidential_Seal";
	    valueDescription = "HALF DOLLAR";
	    ridgedEdge = true;
	    metallurgy = "Cupro-Nickel";
	}
	else if (cmpDoubles(value, DOLLAR_VALUE)) {
	    familiarName = "Dollar";
	    frontImage = "S_Anthony";
	    backImage = "Moon_Eagle";
	    valueDescription = "ONE DOLLAR";
	    ridgedEdge = true;
	    metallurgy = "Cupro-Nickel";
	}
	else value = 0;

	this.value = value;
	this.manufactureYear = year;

	frontMotto = "IN GOD WE TRUST";
	backMotto = "E PLURIBUS UNUM";
	frontLabel = "LIBERTY";
	backLabel = "UNITED STATES OF AMERICA";
	
    }
    private boolean cmpDoubles(double a, double b) {
	return Math.abs(a-b) < 0.00001;
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
