package basuya.muknana.pattern.prototype;

import basuya.muknana.origin.cloneableshape.Circle;
import basuya.muknana.origin.cloneableshape.Rectangle;
import basuya.muknana.origin.cloneableshape.Shape;
import basuya.muknana.origin.cloneableshape.Square;

import java.util.Hashtable;

/**
 * Created by 2904 on 2015/4/7.
 */
public class ShapeCache {
    private static Hashtable<String, Shape
                > shapeMap  = new Hashtable<String, Shape>();

    public static Shape getShape(String shapeId) {
        Shape cachedShape = shapeMap.get(shapeId);
        return (Shape) cachedShape.clone();
    }

    // for each shape run database query and create shape
    // shapeMap.put(shapeKey, shape);
    // for example, we are adding three shapes

    public static void loadCache() {
        Circle circle = new Circle();
        circle.setId("1");
        shapeMap.put(circle.getId(),circle);

        Square square = new Square();
        square.setId("2");
        shapeMap.put(square.getId(),square);

        Rectangle rectangle = new Rectangle();
        rectangle.setId("3");
        shapeMap.put(rectangle.getId(), rectangle);
    }
}
