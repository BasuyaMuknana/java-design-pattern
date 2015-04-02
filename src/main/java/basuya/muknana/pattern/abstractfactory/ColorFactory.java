package basuya.muknana.pattern.abstractfactory;

import basuya.muknana.origin.color.Blue;
import basuya.muknana.origin.color.Color;
import basuya.muknana.origin.color.Green;
import basuya.muknana.origin.color.Red;
import basuya.muknana.origin.shape.Shape;


/**
 * Created by 2904 on 2015/4/2.
 */
public class ColorFactory extends AbstractFactory {
    @Override
    public Shape getShape(String shapeType){
        return null;
    }

    @Override
    public Color getColor(String colorType) {

        if(colorType == null){
            return null;
        }

        if(colorType.equalsIgnoreCase("RED")){
            return new Red();

        }else if(colorType.equalsIgnoreCase("GREEN")){
            return new Green();

        }else if(colorType.equalsIgnoreCase("BLUE")){
            return new Blue();
        }

        return null;
    }
}
