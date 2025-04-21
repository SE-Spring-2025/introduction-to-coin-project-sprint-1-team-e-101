import java.util.Calendar;

public class HalfDollar extends Coin
{
    public HalfDollar()
    {
        super("HalfDollar", HALFDOLLAR_VALUE, "IN GOD WE TRUST", "E PLURIBUS UNUM", 
            "LIBERTY", "UNITED STATES OF AMERICA", "J_Kennedy", "Presidential_Seal", 
            "HALF DOLLAR", true, new CuproNickel(), Calendar.getInstance().get(Calendar.YEAR));
    }

    public HalfDollar(int year)
    {
        super("HalfDollar", HALFDOLLAR_VALUE, "IN GOD WE TRUST", "E PLURIBUS UNUM", 
            "LIBERTY", "UNITED STATES OF AMERICA", "J_Kennedy", "Presidential_Seal", 
            "HALF DOLLAR", true, new CuproNickel(), year);
    }
}
