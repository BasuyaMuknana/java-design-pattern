package basuya.muknana.pattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 2904 on 2015/4/15.
 */
public class Broker {
    private List<Order> orderList = new ArrayList<Order>();

    public void takeOrder(Order order){
        orderList.add(order);
    }

    public void placeOrders(){

        for (Order order : orderList) {
            order.execute();
        }
        orderList.clear();
    }
}
