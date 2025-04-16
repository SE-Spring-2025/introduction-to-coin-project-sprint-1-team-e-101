import java.text.DecimalFormat;
import java.util.Calendar;

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
    private Metallurgy delegator;

    protected static CoinCounts coinCounter = new CointCounts();

    
    public Coin(String familiarName, double value, String frontMotto, String backMotto, String frontLabel, 
                String backLabel, String frontImage, String backImage, String valueDescription, boolean ridgedEdge, 
                Metallurgy delegator, int manufactureYear) {
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
        this.delegator = delegator;
        this.manufactureYear = manufactureYear;
        smelt();
    }
  
    public Coin(double value) {
        this(value, Calendar.getInstance().get(Calendar.YEAR));
    }
    
    public Coin(double value, int year) {
        this.value = value;
        this.manufactureYear = year;
        this.frontMotto = "IN GOD WE TRUST";
        this.backMotto = "E PLURIBUS UNUM";
        this.frontLabel = "LIBERTY";
        this.backLabel = "UNITED STATES OF AMERICA";
        
        if (Math.abs(value - PENNY_VALUE) < 0.00001) {
            this.familiarName = "Penny";
            this.frontImage = "A_Lincoln";
            this.backImage = "Lincoln_Memorial";
            this.valueDescription = "ONE CENT";
            this.ridgedEdge = false;
            this.delegator = new Copper();
        } else if (Math.abs(value - NICKEL_VALUE) < 0.00001) {
            this.familiarName = "Nickel";
            this.frontImage = "T_Jefferson";
            this.backImage = "Jefferson_Memorial";
            this.valueDescription = "FIVE CENTS";
            this.ridgedEdge = false;
            this.delegator = new CuproNickel();
        } else if (Math.abs(value - DIME_VALUE) < 0.00001) {
            this.familiarName = "Dime";
            this.frontImage = "F_Roosevelt";
            this.backImage = "Torch_Branches";
            this.valueDescription = "ONE DIME";
            this.ridgedEdge = true;
            this.delegator = new CuproNickel();
        } else if (Math.abs(value - QUARTER_VALUE) < 0.00001) {
            this.familiarName = "Quarter";
            this.frontImage = "G_Washington";
            this.backImage = "Eagle";
            this.valueDescription = "QUARTER DOLLAR";
            this.ridgedEdge = true;
            this.delegator = new CuproNickel();
        } else if (Math.abs(value - HALFDOLLAR_VALUE) < 0.00001) {
            this.familiarName = "HalfDollar";
            this.frontImage = "J_Kennedy";
            this.backImage = "Presidential_Seal";
            this.valueDescription = "HALF DOLLAR";
            this.ridgedEdge = true;
            this.delegator = new CuproNickel();
        } else if (Math.abs(value - DOLLAR_VALUE) < 0.00001) {
            this.familiarName = "Dollar";
            this.frontImage = "S_Anthony";
            this.backImage = "Moon_Eagle";
            this.valueDescription = "ONE DOLLAR";
            this.ridgedEdge = true;
            this.delegator = new CuproNickel();
        } else {
            this.familiarName = "Generic";
            this.frontImage = "Generic_Front";
            this.backImage = "Generic_Back";
            this.valueDescription = String.valueOf(value);
            this.ridgedEdge = false;
            this.delegator = new CuproNickel();
        }
        smelt();
    }
    
    public void smelt() {
        this.metallurgy = delegator.smelt();
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

    public static CoinCounts getCoinCounter()
    {
        return coinCounter;
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
