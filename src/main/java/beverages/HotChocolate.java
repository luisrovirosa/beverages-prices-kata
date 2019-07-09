package beverages;

public class HotChocolate extends Drink {
    @Override
    public double price() {
        return drink.price() + 1.45;
    }
}
