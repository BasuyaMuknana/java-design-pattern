package basuya.muknana.pattern.visitor;

/**
 * Created by 2904 on 2015/4/16.
 */
public class Keyboard implements ComputerPart {
    @Override
    public void accept(ComputerPartVisitor computerPartVisitor) {
        computerPartVisitor.visit(this);
    }
}
