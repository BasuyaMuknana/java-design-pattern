package basuya.muknana.pattern.visitor;

/**
 * Created by 2904 on 2015/4/16.
 */
public class VisitorPatternDemo {
    public static void main(String[] args) {

        ComputerPart computer = new Computer();
        computer.accept(new ComputerPartDisplayVisitor());
    }
}
