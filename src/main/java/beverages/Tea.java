package beverages;

public class Tea extends Drink {
    @Override
    public double price() {
        return drink.price() + 1.5;
    }
}
