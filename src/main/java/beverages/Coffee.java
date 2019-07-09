package beverages;

public class Coffee extends Drink {
    @Override
    public double price() {
        return drink.price() + 1.2;
    }
}
