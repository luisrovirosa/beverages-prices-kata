package beverages;

public class NoExtra implements Beverage {
    public NoExtra() {
    }

    @Override
    public double price() {
        return 0;
    }
}
