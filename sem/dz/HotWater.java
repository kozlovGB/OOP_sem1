package OOP_sem1.sem.dz;
import OOP_sem1.sem.Water;

public class HotWater extends Water {
    private int temperature;
    public HotWater(String name, double price, String currency, Boolean isSparkling, double volume,int temperature ) {
        super(name, price, currency, isSparkling, volume);
        this.temperature=temperature;
    }
    public String sellItem() {
        // TODO Auto-generated method stub
        return "We sold one "+" bottle of HotWater "+super.name +" "+super.volume+" at a price "+super.currency+super.price;
    }

    public int getTemperature() {
        return this.temperature;
    }
}
