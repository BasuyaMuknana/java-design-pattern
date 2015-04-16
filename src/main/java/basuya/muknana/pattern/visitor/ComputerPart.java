package basuya.muknana.pattern.visitor;

/**
 * Created by 2904 on 2015/4/16.
 */
public interface ComputerPart {
    public void accept(ComputerPartVisitor computerPartVisitor);
}
