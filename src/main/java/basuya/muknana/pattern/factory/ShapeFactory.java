package basuya.muknana.pattern.factory;
import basuya.muknana.origin.Circle;
import basuya.muknana.origin.Rectangle;
import basuya.muknana.origin.Shape;
import basuya.muknana.origin.Square;

public class ShapeFactory {
    public Shape getShape(String shapeType){
        if(shapeType == null){
            return null;
        }
        if(shapeType.equalsIgnoreCase("CIRCLE")){
            return new Circle();

        } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
            return new Rectangle();

        } else if(shapeType.equalsIgnoreCase("SQUARE")){
            return new Square();
        }

        return null;
    }


}