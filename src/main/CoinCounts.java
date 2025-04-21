
import java.util.List;
import java.util.ArrayList;

/**
 * Tracks total coins minted and number of quarters.
 * Notifies registered observers whenever counts change.
 */
public class CoinCounts {
    /** Observer functional interface (pull‑style). */
    @FunctionalInterface
    public interface Observer {
        void countsChanged();
    }

    private int totalCoins = 0;
    private int quarterCount = 0;
    private final List<Observer> observers = new ArrayList<>();

    public void addObserver(Observer o) {
        synchronized (observers) {
            observers.add(o);
        }
    }

    public void removeObserver(Observer o) {
        synchronized (observers) {
            observers.remove(o);
        }
    }

    /** Call this whenever *any* coin is constructed. */
    public void increment(String familiarName) {
        totalCoins++;
        if ("Quarter".equals(familiarName)) {
            quarterCount++;
        }
        notifyObservers();
    }

    private void notifyObservers() {
        synchronized (observers) {
            for (Observer o : observers) {
                o.countsChanged();
            }
        }
    }

    // --- getters for dashboards to pull updated values ---
    public int getTotalCoins() {
        return totalCoins;
    }

    public int getQuarterCount() {
        return quarterCount;
    }
}
