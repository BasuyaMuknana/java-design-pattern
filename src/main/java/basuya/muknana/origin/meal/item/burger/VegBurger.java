package basuya.muknana.origin.meal.item.burger;

/**
 * Created by 2904 on 2015/4/2.
 */
public class VegBurger extends Burger{
    @Override
    public float price() {
        return 25.0f;
    }

    @Override
    public String name() {
        return "Veg Burger";
    }
}
