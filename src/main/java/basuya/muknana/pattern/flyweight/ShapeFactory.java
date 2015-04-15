package basuya.muknana.pattern.flyweight;

import basuya.muknana.origin.shape.Circle;
import basuya.muknana.origin.shape.Shape;

import java.util.HashMap;

/**
 * Created by 2904 on 2015/4/15.
 */
public class ShapeFactory {
    private static final HashMap<String, Shape> circleMap = new HashMap();

    public static Shape getCircle(String color) {
        Circle circle = (Circle)circleMap.get(color);

        if(circle == null) {
            circle = new Circle(color);
            circleMap.put(color, circle);
            System.out.println("Creating circle of color : " + color);
        }
        return circle;
    }
}
