package basuya.muknana.origin.meal.item;

import basuya.muknana.origin.meal.packing.Packing;

/**
 * Created by 2904 on 2015/4/2.
 */
public interface Item {
    public String name();
    public Packing packing();
    public float price();
}
