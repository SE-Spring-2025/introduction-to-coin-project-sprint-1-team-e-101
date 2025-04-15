import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class TotalCoinsDashboard extends JFrame implements Observer
{
    private JLabel label;

    public TotalCoinsDashboard(CoinCounts coinCounts)
    {
        coinCounts.addObserver(this);

        setTitle("Total Coins Dashboard");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        label = new JLabel("Total Coins: " + coinCounts.getTotalCoins());
        add(label);

        pack();
        setVisible(true);
    }

    @Override
    public void update()
    {
        label.setText("Total Coins: " + coinCounts.getTotalCoins());
    }
}
