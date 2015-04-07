package basuya.muknana.origin.state;

/**
 * Created by 2904 on 2015/4/7.
 */
public class StopState implements State {
    public void doAction(Context context) {
        System.out.println("Player is in stop state");
        context.setState(this);
    }

    public String toString(){
        return "Stop State";
    }
}
