import java.util.Calendar;
import java.text.DecimalFormat;

/**
 * The Coin class represents a U.S. coin with various attributes such as value, images, mottos,
 * labels, and manufacturing year. Depending on the monetary value provided, the class automatically
 * sets properties corresponding to specific coin types (e.g., Penny, Nickel, Dime, etc.).
 */
public class Coin {

    // Constant values representing the denominations of U.S. coins.
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
    
    /**
     * Default constructor that initializes a coin with a default value of 0.
     */
    public Coin() {
        this(0);
    }
    
    /**
     * Constructor that initializes a coin with the specified value and uses the current year
     * as the manufacturing year.
     *
     * @param value the monetary value of the coin
     */
    public Coin(double value) {
        this(value, (Calendar.getInstance()).get(Calendar.YEAR));
    }
    
    /**
     * Constructor that initializes a coin with a given value and manufacture year.
     * The coin's properties are set based on its monetary value.
     *
     * @param value the monetary value of the coin
     * @param year the manufacturing year of the coin
     */
    public Coin(double value, int year) {
        // Set coin properties based on the provided value.
        if (cmpDoubles(value, PENNY_VALUE)) {
            familiarName = "Penny";
            frontImage = "A_Lincoln";
            backImage = "Lincoln_Memorial";
            valueDescription = "ONE CENT";
            ridgedEdge = false;
            metallurgy = "Copper";
        } else if (cmpDoubles(value, NICKEL_VALUE)) {
            familiarName = "Nickel";
            frontImage = "T_Jefferson";
            backImage = "Jefferson_Memorial";
            valueDescription = "FIVE CENTS";
            ridgedEdge = false;
            metallurgy = "Cupro-Nickel";
        } else if (cmpDoubles(value, DIME_VALUE)) {
            familiarName = "Dime";
            frontImage = "F_Roosevelt";
            backImage = "Torch_Branches";
            valueDescription = "ONE DIME";
            ridgedEdge = true;
            metallurgy = "Cupro-Nickel";
        } else if (cmpDoubles(value, QUARTER_VALUE)) {
            familiarName = "Quarter";
            frontImage = "G_Washington";
            backImage = "Eagle";
            valueDescription = "QUARTER DOLLAR";
            ridgedEdge = true;
            metallurgy = "Cupro-Nickel";
        } else if (cmpDoubles(value, HALFDOLLAR_VALUE)) {
            familiarName = "HalfDollar";
            frontImage = "J_Kennedy";
            backImage = "Presidential_Seal";
            valueDescription = "HALF DOLLAR";
            ridgedEdge = true;
            metallurgy = "Cupro-Nickel";
        } else if (cmpDoubles(value, DOLLAR_VALUE)) {
            familiarName = "Dollar";
            frontImage = "S_Anthony";
            backImage = "Moon_Eagle";
            valueDescription = "ONE DOLLAR";
            ridgedEdge = true;
            metallurgy = "Cupro-Nickel";
        } else {
            // If the coin value does not match any known denomination, default to 0.
            value = 0;
        }

        // Assign the final values to instance variables.
        this.value = value;
        this.manufactureYear = year;
        
        // Set default mottos and labels that are common to all U.S. coins.
        frontMotto = "IN GOD WE TRUST";
        backMotto = "E PLURIBUS UNUM";
        frontLabel = "LIBERTY";
        backLabel = "UNITED STATES OF AMERICA";
    }
    
    /**
     * Helper method to compare two double values for equality within a small tolerance.
     *
     * @param a the first double value
     * @param b the second double value
     * @return true if the values are approximately equal; otherwise, false
     */
    private boolean cmpDoubles(double a, double b) {
        return Math.abs(a - b) < 0.00001;
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
