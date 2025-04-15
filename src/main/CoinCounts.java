import java.util.ArrayList;

public class CoinCounts implements Subject
{
    private ArrayList<Observer> observers;
    private int totalCoins, quarterCount;

    public CoinCounts()
    {
        observers = new ArrayList<>();
        totalCoins = 0;
        quarterCount = 0;
    }

    @Override
    public void addObserver(Observer o)
    {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o)
    {
        observers.remove(o);
    }

    @Override
    public void notifyObservers()
    {
        for (Observer obs : observers)
        {
            obs.update();
        }
    }

    //implement methods for incrementing
    public void incrementTotal()
    {
        totalCoins++;
        notifyObservers();
    }

    public void incrementQuarter()
    {
        quarterCount++;
        notifyObservers();
    }

    // implement getter methods
    public int getTotalCoins()
    {
        return totalCoins;
    }

    public int getQuarterCount()
    {
        return quarterCount;
    }
}
