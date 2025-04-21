
// Quarter.java
import java.util.Calendar;

public class Quarter extends Coin {
    public Quarter() {
        super("Quarter", QUARTER_VALUE, // typo fixed here
                "IN GOD WE TRUST", "E PLURIBUS UNUM",
                "LIBERTY", "UNITED STATES OF AMERICA",
                "G_Washington", "Eagle",
                "QUARTER DOLLAR", true,
                new CuproNickel(),
                Calendar.getInstance().get(Calendar.YEAR));
    }

    public Quarter(int year) {
        super("Quarter", QUARTER_VALUE,
                "IN GOD WE TRUST", "E PLURIBUS UNUM",
                "LIBERTY", "UNITED STATES OF AMERICA",
                "G_Washington", "Eagle",
                "QUARTER DOLLAR", true,
                new CuproNickel(),
                year);
    }

    public Quarter(Metallurgy smelter) {
        super("Quarter", QUARTER_VALUE,
                "IN GOD WE TRUST", "E PLURIBUS UNUM",
                "LIBERTY", "UNITED STATES OF AMERICA",
                "G_Washington", "Eagle",
                "QUARTER DOLLAR", true,
                smelter,
                Calendar.getInstance().get(Calendar.YEAR));
    }

    public Quarter(Metallurgy smelter, int year) {
        super("Quarter", QUARTER_VALUE,
                "IN GOD WE TRUST", "E PLURIBUS UNUM",
                "LIBERTY", "UNITED STATES OF AMERICA",
                "G_Washington", "Eagle",
                "QUARTER DOLLAR", true,
                smelter,
                year);
    }
}
