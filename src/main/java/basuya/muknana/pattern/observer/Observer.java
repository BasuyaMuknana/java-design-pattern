package basuya.muknana.pattern.observer;

/**
 * Created by 2904 on 2015/4/16.
 */
public abstract class Observer {
    protected Subject subject;
    public abstract void update();
}
