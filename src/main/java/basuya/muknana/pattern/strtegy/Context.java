package basuya.muknana.pattern.strtegy;

/**
 * Created by 2904 on 2015/4/16.
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy){
        this.strategy = strategy;
    }

    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1, num2);
    }
}
