package beverages;

public class HotChocolate extends Drink {
    public HotChocolate() {
        super();
    }

    public HotChocolate(Beverage drink) {
        super(drink);
    }

    @Override
    public double price() {
        return drink.price() + 1.45;
    }
}
