package basuya.muknana.origin.state;

/**
 * Created by 2904 on 2015/4/7.
 */
public class Context {
    private State state;

    public Context(){
        state = null;
    }

    public void setState(State state){
        this.state = state;
    }

    public State getState(){
        return state;
    }
}
