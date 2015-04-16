package basuya.muknana.pattern.template;

/**
 * Created by 2904 on 2015/4/16.
 */
public class TemplatePatternDemo {
    public static void main(String[] args) {

        Game game = new Cricket();
        game.play();
        System.out.println();
        game = new Football();
        game.play();
    }
}
