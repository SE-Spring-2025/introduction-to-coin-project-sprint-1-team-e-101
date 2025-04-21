import java.util.Calendar;

public class Nickel extends Coin
{
    public Nickel()
    {
        super("Nickel", NICKEL_VALUE, "IN GOD WE TRUST", "E PLURIBUS UNUM", 
                  "LIBERTY", "UNITED STATES OF AMERICA", "T_Jefferson", "Jefferson_Memorial", 
                  "FIVE CENTS", false, new CuproNickel(), Calendar.getInstance().get(Calendar.YEAR));
    }

    public Nickel(int year)
    {
        super("Nickel", NICKEL_VALUE, "IN GOD WE TRUST", "E PLURIBUS UNUM", 
        "LIBERTY", "UNITED STATES OF AMERICA", "T_Jefferson", "Jefferson_Memorial", 
        "FIVE CENTS", false, new CuproNickel(), year);
    }
}