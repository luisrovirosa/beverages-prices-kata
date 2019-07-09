package beverages;

public class Tea extends Drink {
    public Tea() {
        super();
    }

    public Tea(Beverage drink) {
        super(drink);
    }

    @Override
    public double price() {
        return drink.price() + 1.5;
    }
}
