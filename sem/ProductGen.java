package OOP_sem1.sem;

public abstract class ProductGen {

    protected double price;
    protected String name;
    protected static String currency;

    public String getName() {
        return this.name;
    }

    public double getPrice() {
        return this.price;
    }

    @Override
    public String toString() {
        return this.name + " - " + price + this.currency;
    }
}
