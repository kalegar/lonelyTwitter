/*
 * Tweet
 *
 * Version 1.0
 *
 * September 26, 2017
 *
 * Copyright 2017 Team X, CMPUT 301, University of Alberta.
 * All Rights Reserved. You may use, distribute or modify this code under
 * terms and conditions of the Code of Student Behaviour at University of Alberta.
 * You may find a copy of the license in this project. Otherwise please contact contact@abc.ca
 */

package ca.ualberta.cs.lonelytwitter;

import java.util.Date;

/**
 * Represents a tweet.
 * Contains the message of the tweet as well as the date it was tweeted.
 *
 * @author atsmith
 * @version 1.0
 * @see NormalTweet
 * @see ImportantTweet
 * @since 1.0
 */
public abstract class Tweet {

    private String message;
    private Date date;


    /**
     * Constructor for Tweet
     * Takes a String containing the message of the tweet as a parameter.
     * This string cannot be longer than 140 characters.
     * If it is, a runtime exception will be thrown.
     * The tweet's date will be set to the current date.
     *
     * @param message tweet message
     */
    public Tweet(String message) {
        try {
            setMessage(message);
        } catch (TweetTooLongException e) {
            throw new RuntimeException();
        }
        this.date = new Date(System.currentTimeMillis());
    }

    /**
     * Constructor for Tweet
     * The message cannot be longer than 140 characters.
     * If it is, a runtime exception will be thrown.
     *
     * @param message tweet message
     * @param date tweet date
     */
    public Tweet(String message, Date date){
        try {
            setMessage(message);
        } catch (TweetTooLongException e){
            throw new RuntimeException();
        }
        this.date = date;
    }

    /**
     * Abstract method for determining if a tweet is 'important' or not.
     *
     * @see ImportantTweet
     * @return
     */
    public abstract Boolean isImportant();

    /**
     * Getter for the tweet's message.
     *
     * @return the tweet's message
     */
    public String getMessage(){
        return message;
    }

    /**
     * Setter for the tweet's message.
     * Cannot be longer than 140 characters.
     *
     * @param message tweet message
     * @throws TweetTooLongException if message is longer than 140 chars.
     */
    public void setMessage(String message) throws TweetTooLongException{
        if (message.length()>140){
            throw new TweetTooLongException();
        }else {
            this.message = message;
        }
    }

    /**
     * Getter for the tweet's date
     *
     * @return the date of the tweet
     */
    public Date getDate(){
        return date;
    }

    /**
     * Setter for the tweet's date
     *
     * @param date
     */
    public void setDate(Date date){
        this.date = date;
    }

    /**
     * Returns a string version of the tweet including the date and the message.
     * Example: 2017-09-26 17:40:11 | This is a tweet
     *
     * @return
     */
    @Override
    public String toString() {
        return date.toString() + " | " + message;
    }
}
