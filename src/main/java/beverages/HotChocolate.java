package beverages;

public class HotChocolate extends Drink {
    public HotChocolate() {
        super();
    }

    public HotChocolate(Beverage drink) {
        super(drink);
    }

    @Override
    protected double drinkPrice() {
        return 1.45;
    }
}
