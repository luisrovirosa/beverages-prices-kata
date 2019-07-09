package beverages;

public class WithCream extends Drink {
    public WithCream() {
        super();
    }

    public WithCream(Beverage drink) {
        super(drink);
    }

    @Override
    protected double drinkPrice() {
        return 0.15;
    }
}
