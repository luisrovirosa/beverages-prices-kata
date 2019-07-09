package beverages;

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
        return new Tea()
                .with(new Milk());
    }

    public Beverage coffeeWithMilk() {
        return new Coffee()
                .with(new Milk());
    }

    public Beverage coffeeWithMilkAndCream() {
        return new Coffee()
                .with(new Milk())
                .with(new Cream());
    }

    public Beverage hotChocolateWithCream() {
        return new HotChocolate()
                .with(new Cream());
    }
}
