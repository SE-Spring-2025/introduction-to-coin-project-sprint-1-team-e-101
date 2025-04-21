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