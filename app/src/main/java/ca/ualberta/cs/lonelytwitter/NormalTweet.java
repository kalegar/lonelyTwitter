package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by atsmith on 9/12/17.
 */

public class NormalTweet extends Tweet {

    public NormalTweet(String Message) {
        super(Message);
    }

    public NormalTweet(String message, Date date) {
        super(message, date);
    }

    @Override
    public Boolean isImportant() {
        return false;
    }
}
