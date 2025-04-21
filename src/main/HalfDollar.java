
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

    @Override
    protected Coin smelt(Coin in) {
        System.out.println("🔥 Smelting " + in.getFamiliarName()
                + " in " + in.getMetallurgy());
        return in;
    }

    @Override
    protected Coin ridge(Coin in) {
        if (in.hasRidgedEdge()) {
            System.out.println("🌟 Adding ridged edge to " + in.getFamiliarName());
        } else {
            System.out.println("➖ Skipping ridging for " + in.getFamiliarName());
        }
        return in;
    }

    @Override
    protected Coin imprintFrontImage(Coin in) {
        System.out.println("🖼️  Imprinting front image '"
                + in.getFrontImage() + "'");
        return in;
    }

    @Override
    protected Coin imprintFrontMotto(Coin in) {
        System.out.println("✒️  Imprinting front motto '"
                + in.getFrontMotto()
                + "' with label '" + in.getFrontLabel() + "'");
        return in;
    }

    @Override
    protected Coin imprintBackImage(Coin in) {
        System.out.println("🖼️  Imprinting back image '"
                + in.getBackImage() + "'");
        return in;
    }

    @Override
    protected Coin imprintBackMotto(Coin in) {
        System.out.println("✒️  Imprinting back motto '"
                + in.getBackMotto()
                + "' and value desc '" + in.getValueDescription() + "'");
        return in;
    }
}
