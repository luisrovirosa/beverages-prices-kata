package beverages;

public class Drink implements Beverage {
    private Beverage drink;

    public Drink() {
        drink = new NoDrink();
    }

    public Drink(Beverage drink) {
        this.drink = drink;
    }

    @Override
    public double price() {
        return drink.price();
    }
}
