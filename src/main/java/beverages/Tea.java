package beverages;

public class Tea extends Drink {
    public Tea() {
        super();
    }

    public Tea(Beverage drink) {
        super(drink);
    }

    @Override
    protected double drinkPrice() {
        return 1.5;
    }
}
