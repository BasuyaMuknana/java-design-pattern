package basuya.muknana.pattern.strtegy;

/**
 * Created by 2904 on 2015/4/16.
 */
public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
