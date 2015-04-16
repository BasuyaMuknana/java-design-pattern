package basuya.muknana.pattern.visitor;

/**
 * Created by 2904 on 2015/4/16.
 */
public interface ComputerPartVisitor {
    public void visit(Computer computer);
    public void visit(Mouse mouse);
    public void visit(Keyboard keyboard);
    public void visit(Monitor monitor);
}
