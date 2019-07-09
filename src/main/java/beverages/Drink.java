package beverages;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public abstract class Drink implements Beverage {
    private List<Beverage> beverages = new ArrayList<>();

    public Drink with(Beverage beverage) {
        this.beverages.add(beverage);
        return this;
    }

    @Override
    public double price() {
        return beverages.stream()
                .map(Beverage::price)
                .reduce(0.0, Double::sum);
    }
}
