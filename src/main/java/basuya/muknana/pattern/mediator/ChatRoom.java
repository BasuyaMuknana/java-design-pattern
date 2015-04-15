package basuya.muknana.pattern.mediator;

import java.util.Date;

/**
 * Created by 2904 on 2015/4/15.
 */
public class ChatRoom {
    public static void showMessage(User user, String message){
        System.out.println(new Date().toString() + " [" + user.getName() + "] : " + message);
    }
}
