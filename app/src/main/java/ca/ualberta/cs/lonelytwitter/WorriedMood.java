package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by atsmith on 9/12/17.
 */

public class WorriedMood extends Mood {
    public WorriedMood() {
    }

    public WorriedMood(Date date) {
        super(date);
    }

    public String format() {
        return "Worried.";
    }
}
