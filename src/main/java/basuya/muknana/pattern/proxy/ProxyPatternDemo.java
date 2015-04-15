package basuya.muknana.pattern.proxy;

import basuya.muknana.origin.image.Image;

/**
 * Created by 2904 on 2015/4/15.
 */
public class ProxyPatternDemo {
    public static void main(String[] args) {
        Image image = new ProxyImage("test_10mb.jpg");

        //image will be loaded from disk
        image.display();
        System.out.println("");

        //image will not be loaded from disk
        image.display();
    }
}
