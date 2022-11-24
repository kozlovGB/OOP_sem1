package OOP_sem1.sem;

public class Water extends ProductGen implements VendingInterface {

    private boolean isSparkling;
    protected double volume;



    public Water(String name, double price, String currency, Boolean isSparkling, double volume) {
        this.volume = volume;
        this.isSparkling = isSparkling;
        super.name = name;
        super.price = price;
        super.currency = currency;
    }

    @Override
    public String toString() {
        // TODO Auto-generated method stub
        return super.toString();
    }

    @Override
    public String getName() {
        // TODO Auto-generated method stub
        return super.getName();
    }

    @Override
    public double getPrice() {
        // TODO Auto-generated method stub
        return super.getPrice();
    }

    @Override
    public String sellItem() {
        // TODO Auto-generated method stub
        String sparkle = isSparkling  ? "sparkling" : "still";
        return "We sold one "+sparkle+" bottle of water "+super.name +" "+this.volume+" at a price "+super.currency+super.price;
    }

    public double getVolume() {
        return this.volume;
    }

}