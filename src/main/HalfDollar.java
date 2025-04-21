
// HalfDollar.java
import java.util.Calendar;

public class HalfDollar extends Coin {
    public HalfDollar() {
        super("HalfDollar", HALFDOLLAR_VALUE,
                "IN GOD WE TRUST", "E PLURIBUS UNUM",
                "LIBERTY", "UNITED STATES OF AMERICA",
                "J_Kennedy", "Presidential_Seal",
                "HALF DOLLAR", true,
                new CuproNickel(),
                Calendar.getInstance().get(Calendar.YEAR));
    }

    public HalfDollar(int year) {
        super("HalfDollar", HALFDOLLAR_VALUE,
                "IN GOD WE TRUST", "E PLURIBUS UNUM",
                "LIBERTY", "UNITED STATES OF AMERICA",
                "J_Kennedy", "Presidential_Seal",
                "HALF DOLLAR", true,
                new CuproNickel(),
                year);
    }

    public HalfDollar(Metallurgy smelter) {
        super("HalfDollar", HALFDOLLAR_VALUE,
                "IN GOD WE TRUST", "E PLURIBUS UNUM",
                "LIBERTY", "UNITED STATES OF AMERICA",
                "J_Kennedy", "Presidential_Seal",
                "HALF DOLLAR", true,
                smelter,
                Calendar.getInstance().get(Calendar.YEAR));
    }

    public HalfDollar(Metallurgy smelter, int year) {
        super("HalfDollar", HALFDOLLAR_VALUE,
                "IN GOD WE TRUST", "E PLURIBUS UNUM",
                "LIBERTY", "UNITED STATES OF AMERICA",
                "J_Kennedy", "Presidential_Seal",
                "HALF DOLLAR", true,
                smelter,
                year);
    }
}
