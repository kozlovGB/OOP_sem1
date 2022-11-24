package OOP_sem1.sem;

import java.util.ArrayList;

public class VendingMachine {

    private ArrayList<Product> assortmentHotDrinks = new ArrayList<>();

    protected void addProduct(Product item) {
        this.assortmentHotDrinks.add(item);
    }

    protected void initProducts(ArrayList<Product> items) {
        for (Product item : items) {
            addProduct(item);
        }

    }

    public Product getProduct(String name) {
        for (int i = 0; i < this.assortmentHotDrinks.size(); i++) {
            String currentName = this.assortmentHotDrinks.get(i).getName();
            if (currentName.equals(name)) {
                Product boughProduct = this.assortmentHotDrinks.get(i);
                this.assortmentHotDrinks.remove(i);
                return boughProduct;
            }
        }

        return new Product("Empty", 0);
    }

    public ArrayList checkAssortment() {
        return this.assortmentHotDrinks;

    }



}
