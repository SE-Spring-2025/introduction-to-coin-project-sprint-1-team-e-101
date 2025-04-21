
// Dollar.java
import java.util.Calendar;

public class Dollar extends Coin {
    public Dollar() {
        super("Dollar", DOLLAR_VALUE,
                "IN GOD WE TRUST", "E PLURIBUS UNUM",
                "LIBERTY", "UNITED STATES OF AMERICA",
                "S_Anthony", "Moon_Eagle",
                "ONE DOLLAR", true,
                new CuproNickel(),
                Calendar.getInstance().get(Calendar.YEAR));
    }

    public Dollar(int year) {
        super("Dollar", DOLLAR_VALUE,
                "IN GOD WE TRUST", "E PLURIBUS UNUM",
                "LIBERTY", "UNITED STATES OF AMERICA",
                "S_Anthony", "Moon_Eagle",
                "ONE DOLLAR", true,
                new CuproNickel(),
                year);
    }

    public Dollar(Metallurgy smelter) {
        super("Dollar", DOLLAR_VALUE,
                "IN GOD WE TRUST", "E PLURIBUS UNUM",
                "LIBERTY", "UNITED STATES OF AMERICA",
                "S_Anthony", "Moon_Eagle",
                "ONE DOLLAR", true,
                smelter,
                Calendar.getInstance().get(Calendar.YEAR));
    }

    public Dollar(Metallurgy smelter, int year) {
        super("Dollar", DOLLAR_VALUE,
                "IN GOD WE TRUST", "E PLURIBUS UNUM",
                "LIBERTY", "UNITED STATES OF AMERICA",
                "S_Anthony", "Moon_Eagle",
                "ONE DOLLAR", true,
                smelter,
                year);
    }
}
