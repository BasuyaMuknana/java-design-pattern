package basuya.muknana.pattern.abstractfactory;

import basuya.muknana.origin.color.Color;
import basuya.muknana.origin.shape.Circle;
import basuya.muknana.origin.shape.Rectangle;
import basuya.muknana.origin.shape.Shape;
import basuya.muknana.origin.shape.Square;

/**
 * Created by 2904 on 2015/4/2.
 */
public class ShapeFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }

        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();

        }else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();

        }else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }

    @Override
    public Color getColor(String color){
        return null;
    }


}
