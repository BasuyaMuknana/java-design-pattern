package basuya.muknana.origin.shape.bridge;

/**
 * Created by 2904 on 2015/4/14.
 */
public class RedCircle implements DrawAPI{
    @Override
    public void drawCircle(int radius, int x, int y) {
        System.out.println("Drawing Circle[ color: red, radius: " + radius + ", x: " + x + ", " + y + "]");
    }
}
