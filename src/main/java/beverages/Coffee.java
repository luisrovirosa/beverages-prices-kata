package beverages;

public class Coffee extends Drink {
    public Coffee() {
        super();
    }

    public Coffee(Beverage drink) {
        super(drink);
    }

    @Override
    protected double drinkPrice() {
        return 1.2;
    }
}
