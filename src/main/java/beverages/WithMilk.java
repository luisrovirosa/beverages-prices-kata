package beverages;

public class WithMilk extends Drink {
    public WithMilk() {
        super();
    }

    public WithMilk(Beverage drink) {
        super(drink);
    }

    @Override
    protected double drinkPrice() {
        return 0.10;
    }
}
