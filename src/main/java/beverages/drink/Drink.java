package beverages.drink;

import beverages.Beverage;
import beverages.extra.Extra;

import java.util.ArrayList;
import java.util.List;

public abstract class Drink implements Beverage {
    private List<Extra> extras = new ArrayList<>();

    public Drink with(Extra beverage) {
        this.extras.add(beverage);
        return this;
    }

    @Override
    public double price() {
        return extras.stream()
                .map(Extra::price)
                .reduce(0.0, Double::sum);
    }
}
