package OOP_sem1.sem;

import OOP_sem1.sem.dz.HotWater;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;

public class first {
    public static void main(String[] args) {
        Logger logger = Logger.getAnonymousLogger();
        Product item1 = new Product("Chips", 20);
        Product item2 = new Product("Juice", 15);
        Product item3 = new Product("Nuts", 40);
        ArrayList<Product> assort = new ArrayList<>(Arrays.asList(new Product[] { item1, item2, item3 }));
        VendingMachine vendor1 = new VendingMachine();
        vendor1.initProducts(assort);
        logger.info(vendor1.checkAssortment().toString());
        logger.info(vendor1.getProduct("Nuts").toString());
        logger.info(vendor1.checkAssortment().toString());

        Chocolate choco = new Chocolate("Molochniy", 100, "$", "White");
        logger.info(choco.getName());
        logger.info(String.valueOf(choco.getPrice()));
        logger.info(choco.sellItem());

        Water aquaWater = new Water("Aqua Minerale", 50, "$", true, 0.5d);
        logger.info(aquaWater.getName());
        logger.info(String.valueOf(aquaWater.getPrice()));
        logger.info(aquaWater.sellItem());

        HotWater tea = new HotWater("Tea", 50, "$", false, 0.5d, 37);
        logger.info(tea.getName());
        logger.info(String.valueOf(tea.getPrice()));
        logger.info(tea.sellItem());
    }


}
