package beverages;

public class BeverageFactory {
    public Beverage coffee() {
        return new Drink(new Coffee());
    }

    public Beverage tea() {
        return new Drink(new Tea());
    }

    public Beverage hotChocolate() {
        return new Drink(new HotChocolate());
    }

    public Beverage teaWithMilk() {
        return new Tea(new WithMilk());
    }

    public Beverage coffeeWithMilk() {
        return new Coffee(new WithMilk());
    }

    public Beverage coffeeWithMilkAndCream() {
        return new Coffee(new WithMilk(new WithCream()));
    }

    public Beverage hotChocolateWithCream() {
        return new HotChocolateWithCream();
    }
}
