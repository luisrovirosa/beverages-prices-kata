package beverages;

public class Coffee extends Drink {
    public Coffee() {
        super();
    }

    public Coffee(Beverage drink) {
        super(drink);
    }

    @Override
    public double price() {
        return drink.price() + 1.2;
    }
}
