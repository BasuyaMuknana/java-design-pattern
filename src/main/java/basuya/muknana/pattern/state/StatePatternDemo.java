package basuya.muknana.pattern.state;

import basuya.muknana.origin.state.Context;
import basuya.muknana.origin.state.StartState;
import basuya.muknana.origin.state.StopState;

/**
 * Created by 2904 on 2015/4/7.
 */
public class StatePatternDemo {
    public static void main(String[] args) {
        Context context = new Context();

        StartState startState = new StartState();
        startState.doAction(context);

        System.out.println(context.getState().toString());

        StopState stopState = new StopState();
        stopState.doAction(context);

        System.out.println(context.getState().toString());
    }
}
