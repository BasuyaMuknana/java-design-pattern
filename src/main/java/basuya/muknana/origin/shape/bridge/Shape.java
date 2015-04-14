package basuya.muknana.origin.shape.bridge;

/**
 * Created by 2904 on 2015/4/14.
 */
public abstract class Shape {
    protected DrawAPI drawAPI;

    protected Shape(DrawAPI drawAPI){
        this.drawAPI = drawAPI;
    }
    public abstract void draw();

}
