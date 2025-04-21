import javax.swing.*;
import java.awt.*;

public class TotalCoinsDashboard
        extends JFrame
        implements CoinCounts.Observer, Runnable {

    private final CoinCounts counts;
    private JLabel label;

    public TotalCoinsDashboard(CoinCounts counts) {
        this.counts = counts;
        this.counts.addObserver(this);
    }

    @Override
    public void run() {
        setTitle("Total Coins Dashboard");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        label = new JLabel("Total Coins: " + counts.getTotalCoins());
        add(label);
        pack();
        setVisible(true);
    }

    @Override
    public void countsChanged() {
        // always update Swing components on the EDT
        SwingUtilities.invokeLater(() -> label.setText("Total Coins: " + counts.getTotalCoins()));
    }
}
