package OOP_sem1.sem.dz;

import java.util.ArrayList;

public interface Machine {

    HotWater getProduct(String name, double volume, int temperature);

    public ArrayList checkAssortment();
}
