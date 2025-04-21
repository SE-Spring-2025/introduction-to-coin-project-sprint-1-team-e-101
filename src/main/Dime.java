
// Dime.java
import java.util.Calendar;

public class Dime extends Coin {
    public Dime() {
        super("Dime", DIME_VALUE,
                "IN GOD WE TRUST", "E PLURIBUS UNUM",
                "LIBERTY", "UNITED STATES OF AMERICA",
                "F_Roosevelt", "Torch_Branches",
                "ONE DIME", true,
                new CuproNickel(),
                Calendar.getInstance().get(Calendar.YEAR));
    }

    public Dime(int year) {
        super("Dime", DIME_VALUE,
                "IN GOD WE TRUST", "E PLURIBUS UNUM",
                "LIBERTY", "UNITED STATES OF AMERICA",
                "F_Roosevelt", "Torch_Branches",
                "ONE DIME", true,
                new CuproNickel(),
                year);
    }

    public Dime(Metallurgy smelter) {
        super("Dime", DIME_VALUE,
                "IN GOD WE TRUST", "E PLURIBUS UNUM",
                "LIBERTY", "UNITED STATES OF AMERICA",
                "F_Roosevelt", "Torch_Branches",
                "ONE DIME", true,
                smelter,
                Calendar.getInstance().get(Calendar.YEAR));
    }

    public Dime(Metallurgy smelter, int year) {
        super("Dime", DIME_VALUE,
                "IN GOD WE TRUST", "E PLURIBUS UNUM",
                "LIBERTY", "UNITED STATES OF AMERICA",
                "F_Roosevelt", "Torch_Branches",
                "ONE DIME", true,
                smelter,
                year);
    }
}
