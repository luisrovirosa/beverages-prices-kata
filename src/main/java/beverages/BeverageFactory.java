package beverages;

public class BeverageFactory {
    public Beverage coffee() {
        return new Coffee();
    }

    public Beverage tea() {
        return new Tea();
    }
}
