package beverages;

import beverages.drink.HotChocolate;

public class HotChocolateWithCream extends HotChocolate {
    @Override
    public double price() {
        return 1.45 + 0.15;
    }
}
