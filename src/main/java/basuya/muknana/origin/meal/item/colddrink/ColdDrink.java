package basuya.muknana.origin.meal.item.colddrink;

import basuya.muknana.origin.meal.item.Item;
import basuya.muknana.origin.meal.packing.Bottle;
import basuya.muknana.origin.meal.packing.Packing;

/**
 * Created by 2904 on 2015/4/2.
 */
public abstract class ColdDrink implements Item {
    @Override
    public Packing packing() {
        return new Bottle();
    }

    @Override
    public abstract float price();
}
