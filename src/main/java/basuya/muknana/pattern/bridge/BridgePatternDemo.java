package basuya.muknana.pattern.bridge;

import basuya.muknana.origin.shape.bridge.Circle;
import basuya.muknana.origin.shape.bridge.GreenCircle;
import basuya.muknana.origin.shape.bridge.RedCircle;
import basuya.muknana.origin.shape.bridge.Shape;

/**
 * Created by 2904 on 2015/4/14.
 */
public class BridgePatternDemo {
    public static void main(String[] args) {
        Shape redCircle = new Circle(100,100, 10, new RedCircle());
        Shape greenCircle = new Circle(100,100, 10, new GreenCircle());

        redCircle.draw();
        greenCircle.draw();
    }
}
