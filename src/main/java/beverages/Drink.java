package beverages;

import java.util.Arrays;

public class Drink implements Beverage {
    private Beverage[] beverages;

    public Drink(Beverage ...beverages) {
        this.beverages = beverages;
    }

    @Override
    public double price() {
        return Arrays.stream(beverages)
                .map(Beverage::price)
                .reduce(0.0, Double::sum);
    }
}
