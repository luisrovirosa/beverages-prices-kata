package beverages.drink;

public class Tea extends Drink {
    @Override
    public double price() {
        return super.price() + 1.5;
    }
}
