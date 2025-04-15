import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class QuarterCountDashboard extends JFrame implements Observer
{
    private JLabel label;

    public QuarterCountDashboard(CoinCounts coinCounts)
    {
        coinCounts.addObserver(this);

        setTitle("Quarter Count Dashboard");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        label = new JLabel("Total Quarters: " + coinCounts.getTotalQuarters());
        add(label);

        pack();
        setVisible(true);
    }

    @Override
    public void update()
    {
        label.setText("Total Quarters: " + coinCounts.getTotalQuarters());
    }
}
