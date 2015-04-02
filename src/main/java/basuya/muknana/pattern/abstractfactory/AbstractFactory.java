package basuya.muknana.pattern.abstractfactory;

import basuya.muknana.origin.color.Color;
import basuya.muknana.origin.shape.Shape;

/**
 * Created by 2904 on 2015/4/2.
 */
public abstract class AbstractFactory {
    public abstract Color getColor(String colorType);
    public abstract Shape getShape(String shapeType);

}
