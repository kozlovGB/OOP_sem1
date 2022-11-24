package OOP_sem1.sem.dz;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.logging.Logger;

public class Second {
    public static void main(String[] args) {
        Logger logger = Logger.getAnonymousLogger();
        HotWater item1 = new HotWater("teaBlack", 20, "рубль",false,0.7,78);
        HotWater item2 = new HotWater("teaGreen", 15, "рубль",false,0.7,78);
        HotWater item3 = new HotWater("Puar", 40, "рубль",false,0.7,78);
        ArrayList<HotWater> assort = new ArrayList<>(Arrays.asList(new HotWater[]{item1, item2, item3}));
        HotWaterMachine vendor1 = new HotWaterMachine();
        vendor1.initProducts(assort);
        logger.info(vendor1.checkAssortment().toString());
        logger.info(vendor1.getProduct("teaBlack", 0.7, 78).toString());
        logger.info(vendor1.checkAssortment().toString());

        logger.info(vendor1.checkAssortment().toString());
        logger.info(vendor1.getProduct("teaGreen", 0.7, 78).toString());
        logger.info(vendor1.checkAssortment().toString());
    }
}
