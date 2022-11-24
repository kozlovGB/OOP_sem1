package OOP_sem1.sem.dz;

import java.util.ArrayList;

public class HotWaterMachine implements Machine {

    private ArrayList<HotWater> assortmentHotDrinks = new ArrayList<>();

    protected void addProduct(HotWater item) {
        this.assortmentHotDrinks.add(item);
    }

    protected void initProducts(ArrayList<HotWater> items) {
        for (HotWater item : items) {
            addProduct(item);
        }

    }

    @Override
    public HotWater getProduct(String name, double volume, int temperature) {
        for (int i = 0; i < this.assortmentHotDrinks.size(); i++) {
            String currentName = this.assortmentHotDrinks.get(i).getName();
            double currentValume = this.assortmentHotDrinks.get(i).getVolume();
            int currentTemperature = this.assortmentHotDrinks.get(i).getTemperature();
            if (currentName.equals(name)&&currentValume==volume&&currentTemperature==temperature) {
                HotWater boughProduct = this.assortmentHotDrinks.get(i);
                this.assortmentHotDrinks.remove(i);
                return boughProduct;
            }
        }
        return new HotWater("Empty", 0, "-",false,0,0);

    }

    @Override
    public ArrayList checkAssortment() {
        return this.assortmentHotDrinks;
    }
}