package beverages;

public class Drink implements Beverage {
    protected Beverage drink;

    public Drink() {
        this(new NoExtra());
    }

    public Drink(Beverage drink) {
        this.drink = drink;
    }

    public static Drink with(Beverage beverage){
        return new Drink(beverage);
    }

    @Override
    final public double price() {
        return drink.price() + drinkPrice();
    }

    protected double drinkPrice() {
        return 0.0;
    }
}
