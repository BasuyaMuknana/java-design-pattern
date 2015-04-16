package basuya.muknana.pattern.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 2904 on 2015/4/16.
 */
public class CareTaker {
    private List<Memento> mementoList = new ArrayList<Memento>();

    public void add(Memento state){
        mementoList.add(state);
    }

    public Memento get(int index){
        return mementoList.get(index);
    }
}
