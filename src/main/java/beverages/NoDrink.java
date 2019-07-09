package beverages;

public class NoDrink implements Beverage {
    public NoDrink() {
    }

    @Override
    public double price() {
        return 0;
    }
}
