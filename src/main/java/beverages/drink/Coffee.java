package beverages.drink;

public class Coffee extends Drink {
    @Override
    public double price() {
        return super.price() + 1.2;
    }
}
