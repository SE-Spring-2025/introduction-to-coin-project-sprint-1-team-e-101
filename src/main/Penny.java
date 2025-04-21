import java.util.Calendar;

public class Penny extends Coin {
    public Penny() {
        super("Penny", PENNY_VALUE, "IN GOD WE TRUST", "E PLURIBUS UNUM",
                "LIBERTY", "UNITED STATES OF AMERICA", "A_Lincoln", "Lincoln_Memorial",
                "ONE CENT", false, new Copper(), Calendar.getInstance().get(Calendar.YEAR));
    }

    public Penny(int year) {
        super("Penny", PENNY_VALUE, "IN GOD WE TRUST", "E PLURIBUS UNUM",
                "LIBERTY", "UNITED STATES OF AMERICA", "A_Lincoln", "Lincoln_Memorial",
                "ONE CENT", false, new Copper(), year);
    }

    public Penny(Metallurgy smelter) {
        super(
                "Penny", PENNY_VALUE,
                "IN GOD WE TRUST", "E PLURIBUS UNUM",
                "LIBERTY", "UNITED STATES OF AMERICA",
                "A_Lincoln", "Lincoln_Memorial",
                "ONE CENT", false,
                smelter,
                Calendar.getInstance().get(Calendar.YEAR));
    }

    /** use a custom smelter and custom year */
    public Penny(Metallurgy smelter, int year) {
        super(
                "Penny", PENNY_VALUE,
                "IN GOD WE TRUST", "E PLURIBUS UNUM",
                "LIBERTY", "UNITED STATES OF AMERICA",
                "A_Lincoln", "Lincoln_Memorial",
                "ONE CENT", false,
                smelter,
                year);
    }
}