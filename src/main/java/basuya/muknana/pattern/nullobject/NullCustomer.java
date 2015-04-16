package basuya.muknana.pattern.nullobject;

/**
 * Created by 2904 on 2015/4/16.
 */
public class NullCustomer extends AbstractCustomer{
    @Override
    public String getName() {
        return "Not Available in Customer Database";
    }

    @Override
    public boolean isNil() {
        return true;
    }
}
