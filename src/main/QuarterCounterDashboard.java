import javax.swing.*;
import java.awt.*;

public class QuarterCounterDashboard
        extends JFrame
        implements CoinCounts.Observer, Runnable {

    private final CoinCounts counts;
    private JLabel label;

    public QuarterCounterDashboard(CoinCounts counts) {
        this.counts = counts;
        this.counts.addObserver(this);
    }

    @Override
    public void run() {
        setTitle("Quarter Counter Dashboard");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());
        label = new JLabel("Quarter Count: " + counts.getQuarterCount());
        add(label);
        pack();
        setVisible(true);
    }

    @Override
    public void countsChanged() {
        SwingUtilities.invokeLater(() -> label.setText("Quarter Count: " + counts.getQuarterCount()));
    }
}
