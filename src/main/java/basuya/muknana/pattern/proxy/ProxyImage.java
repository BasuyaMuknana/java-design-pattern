package basuya.muknana.pattern.proxy;

import basuya.muknana.origin.image.Image;
import basuya.muknana.origin.image.RealImage;

/**
 * Created by 2904 on 2015/4/15.
 */
public class ProxyImage implements Image {
    private RealImage realImage;
    private String fileName;

    public ProxyImage(String fileName){
        this.fileName = fileName;
    }

    @Override
    public void display() {
        if(realImage == null){
            realImage = new RealImage(fileName);
        }
        realImage.display();
    }
}
