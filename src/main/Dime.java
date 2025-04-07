import java.util.Calendar;

public class Dime extends Coin
{
    public Dime()
    {
        super("Dime", DIME_VALUE, "IN GOD WE TRUST", "E PLURIBUS UNUM", 
                  "LIBERTY", "UNITED STATES OF AMERICA", "F_Roosevelt", "Torch_Branches", 
                  "TEN CENTS", false, new CuproNickel(), Calendar.getInstance().get(Calendar.YEAR));
    }

    public Dime(int year)
    {
        super("Dime", DIME_VALUE, "IN GOD WE TRUST", "E PLURIBUS UNUM", 
        "LIBERTY", "UNITED STATES OF AMERICA", "F_Roosevelt", "Torch Branches", 
        "TEN CENTS", false, new CuproNickel(), year);
    }
}