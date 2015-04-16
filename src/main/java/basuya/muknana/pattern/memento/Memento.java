package basuya.muknana.pattern.memento;

/**
 * Created by 2904 on 2015/4/16.
 */
public class Memento {
    private String state;

    public Memento(String state){
        this.state = state;
    }

    public String getState(){
        return state;
    }

}

