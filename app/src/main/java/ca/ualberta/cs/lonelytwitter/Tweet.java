package ca.ualberta.cs.lonelytwitter;

import java.util.ArrayList;
import java.util.Date;

/**
 * Created by atsmith on 9/12/17.
 */

public abstract class Tweet {

    private String message;
    private Date date;
    private ArrayList<Mood> moods = new ArrayList<Mood>();

    public Tweet(String message){
        try {
            setMessage(message);
        } catch (TweetTooLongException e){

        }
        this.date = new Date(System.currentTimeMillis());
    }

    public Tweet(String Message, Mood mood){
        moods.add(mood);
        try {
            setMessage(message);
        } catch (TweetTooLongException e){

        }
        this.date = new Date(System.currentTimeMillis());
    }

    public Tweet(String message, Date date){
        try {
            setMessage(message);
        } catch (TweetTooLongException e){

        }
        this.date = date;
    }

    public Tweet(String message, Mood mood, Date date){
        moods.add(mood);
        try {
            setMessage(message);
        } catch (TweetTooLongException e){

        }
        this.date = date;
    }

    public abstract Boolean isImportant();

    public String getMessage(){
        return message;
    }

    public void setMessage(String message) throws TweetTooLongException{
        if (message.length()>140){
            throw new TweetTooLongException();
        }else {
            this.message = message;
        }
    }

    public Date getDate(){
        return date;
    }

    public void setDate(Date date){
        this.date = date;
    }

    public ArrayList<Mood> getMoods() {
        return moods;
    }

    public void addMood(Mood mood){
        moods.add(mood);
    }
}
