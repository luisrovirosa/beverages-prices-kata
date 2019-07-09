package beverages;

import static beverages.Drink.with;

public class BeverageFactory {
    public Beverage coffee() {
        return new Coffee();
    }

    public Beverage tea() {
        return new Tea();
    }

    public Beverage hotChocolate() {
        return new HotChocolate();
    }

    public Beverage teaWithMilk() {
        return new Tea(new WithMilk());
    }

    public Beverage coffeeWithMilk() {
        return new Coffee(new WithMilk());
    }

    public Beverage coffeeWithMilkAndCream() {
        return new Coffee(new WithMilk(with(new WithCream())));
    }

    public Beverage hotChocolateWithCream() {
        return new HotChocolate(with(new WithCream()));
    }
}
