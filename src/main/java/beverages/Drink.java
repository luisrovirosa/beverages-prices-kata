package beverages;

public class Drink implements Beverage {
    protected Beverage drink;

    public Drink() {
        this(new NoExtra());
    }

    public Drink(Beverage drink) {
        this.drink = drink;
    }

    @Override
    public double price() {
        return drink.price();
    }
}
