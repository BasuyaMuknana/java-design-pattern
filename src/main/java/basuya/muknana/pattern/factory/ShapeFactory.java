package basuya.muknana.pattern.factory;
import basuya.muknana.origin.shape.Circle;
import basuya.muknana.origin.shape.Rectangle;
import basuya.muknana.origin.shape.Shape;
import basuya.muknana.origin.shape.Square;

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