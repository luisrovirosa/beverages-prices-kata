package beverages;

public class WithMilk extends Drink {
    @Override
    public double price() {
        return drink.price() + 0.10;
    }
}
