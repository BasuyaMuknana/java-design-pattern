package basuya.muknana.pattern.builder;

import basuya.muknana.origin.meal.Meal;
import basuya.muknana.origin.meal.item.burger.ChickenBurger;
import basuya.muknana.origin.meal.item.burger.VegBurger;
import basuya.muknana.origin.meal.item.colddrink.Coke;
import basuya.muknana.origin.meal.item.colddrink.Pepsi;

/**
 * Created by 2904 on 2015/4/2.
 */
public class MealBuilder {
    public Meal prepareVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new VegBurger());
        meal.addItem(new Coke());
        return meal;
    }

    public Meal prepareNonVegMeal (){
        Meal meal = new Meal();
        meal.addItem(new ChickenBurger());
        meal.addItem(new Pepsi());
        return meal;
    }

}
