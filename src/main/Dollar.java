import java.util.Calendar;

public class Dollar extends Coin
{
    public Dollar()
    {
        super("Dollar", DOLLAR_VALUE, "IN GOD WE TRUST", "E PLURIBUS UNUM", 
                  "LIBERTY", "UNITED STATES OF AMERICA", "S_Anthony", "backImage", 
                  "ONE DOLLAR", true, "", Calendar.getInstance().get(Calendar.YEAR));
    }

    public Dollar(int year)
    {
        super("Dollar", DOLLAR_VALUE, "IN GOD WE TRUST", "E PLURIBUS UNUM", 
        "LIBERTY", "UNITED STATES OF AMERICA", "S_Anthony", "Moon_Eagle", 
        "ONE DOLLAR", true, "Cupro-Nickel", year);
    }
}
