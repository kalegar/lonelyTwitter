/*
 * ImportantTweet
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
 * Represents an 'important' tweet.
 *
 * @author atsmith
 * @version 1.0
 * @see Tweet
 */
public class ImportantTweet extends Tweet implements Tweetable{

    /**
     * Constructor for ImportantTweet
     *
     * @param message tweet message
     */
    public ImportantTweet(String message){
        super(message);
    }

    /**
     * Constructor for ImportantTweet
     *
     * @param message tweet message
     * @param date tweet date
     */
    public ImportantTweet(String message, Date date) {
        super(message, date);
    }

    /**
     * Whether this tweet is important.
     * @return true
     */
    @Override
    public Boolean isImportant(){
        return true;
    }

}
