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
        return new TeaWithMilk();
    }

    public Beverage coffeeWithMilk() {
        return new CoffeeWithMilk();
    }

    public Beverage coffeeWithMilkAndCream() {
        return new CoffeeWithMilkAndCream();
    }

    public Beverage hotChocolateWithCream() {
        return new HotChocolateWithCream();
    }
}
