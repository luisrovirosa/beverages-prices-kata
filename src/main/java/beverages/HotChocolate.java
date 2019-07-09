package beverages;

public class HotChocolate extends Drink {
    @Override
    public double price() {
        return super.price() + 1.45;
    }
}
