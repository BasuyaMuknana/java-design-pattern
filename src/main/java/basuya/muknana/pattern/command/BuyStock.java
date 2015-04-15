package basuya.muknana.pattern.command;

import basuya.muknana.origin.stock.Stock;

/**
 * Created by 2904 on 2015/4/15.
 */
public class BuyStock implements Order{
    private Stock abcStock;

    public BuyStock(Stock abcStock){
        this.abcStock = abcStock;
    }

    public void execute() {
        abcStock.buy();
    }
}
