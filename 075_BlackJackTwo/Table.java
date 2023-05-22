import java.util.ArrayList;
import java.util.List;

public class Table {
    private final List<Car> playerHand;
    private final List<Car> dealerHand;

    public Table() {
        playerHand = new ArrayList<>();
        dealerHand = new ArrayList<>();
    }

    public List<Car> getPlayerHand() {
        return playerHand;
    }

    public List<Car> getDealerHand() {
        return dealerHand;
    }
}