package beverages;

public class Drink implements Beverage {
    private Drink drink;

    public Drink() {
    }

    public Drink(Drink drink) {
        this.drink = drink;
    }

    @Override
    public double price() {
        return drink != null ? drink.price() : 0;
    }
}
