package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Created by atsmith on 9/12/17.
 */

public class ExcitedMood extends Mood {

    public ExcitedMood() {
    }

    public ExcitedMood(Date date) {
        super(date);
    }

    public String format() {
        return "Excited!";
    }
}
