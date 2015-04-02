package basuya.muknana.origin.meal.item.burger;

import basuya.muknana.origin.meal.item.Item;
import basuya.muknana.origin.meal.packing.Packing;
import basuya.muknana.origin.meal.packing.Wrapper;

/**
 * Created by 2904 on 2015/4/2.
 */
public abstract class Burger implements Item {
    @Override
    public Packing packing() {
        return new Wrapper();
    }

    @Override
    public abstract float price();
}
