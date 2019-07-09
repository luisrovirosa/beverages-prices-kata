package beverages;

public class WithMilk extends Drink {
    public WithMilk() {
        super();
    }

    public WithMilk(Beverage drink) {
        super(drink);
    }

    @Override
    public double price() {
        return drink.price() + 0.10;
    }
}
