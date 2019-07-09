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
        return new Drink(new Tea(), new Milk());
    }

    public Beverage coffeeWithMilk() {
        return new Drink(new Coffee(), new Milk());
    }

    public Beverage coffeeWithMilkAndCream() {
        return new Drink(new Coffee(), new Milk(), new Cream());
    }

    public Beverage hotChocolateWithCream() {
        return new Drink(new HotChocolate(), new Cream());
    }
}
