package beverages;

import beverages.drink.Coffee;

public class CoffeeWithMilkAndCream extends Coffee {
    @Override
    public double price() {
        return super.price() +  0.25;
    }
}
