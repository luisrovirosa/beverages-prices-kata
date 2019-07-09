package beverages;

public class WithCream extends Drink {
    public WithCream() {
        super();
    }

    public WithCream(Beverage drink) {
        super(drink);
    }

    @Override
    public double price() {
        return drink.price() + 0.15;
    }
}
