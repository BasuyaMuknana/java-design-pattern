package basuya.muknana.origin.logger;

/**
 * Created by 2904 on 2015/4/15.
 */
public class FileLogger extends AbstractLogger{
    public FileLogger(int level){
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("File::Logger: " + message);
    }
}
