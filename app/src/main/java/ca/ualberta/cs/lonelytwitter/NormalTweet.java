/*
 * NormalTweet
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
 * Class representing a 'normal' (not important) tweet.
 *
 * @author atsmith
 * @version 1.0
 * @see Tweet
 */
public class NormalTweet extends Tweet {

    /**
     * Constructor for NormalTweet
     * Takes a string max 140 characters long as a message.
     *
     * @param message
     */
    public NormalTweet(String message) {
        super(message);
    }

    /**
     * Constructor for NormalTweet
     * Takes a string max 140 characters long as a message.
     *
     * @param message
     * @param date
     */
    public NormalTweet(String message, Date date) {
        super(message, date);
    }

    /**
     * Returns whether this tweet is important.
     * For normal tweets, this is false.
     *
     * @return false
     */
    @Override
    public Boolean isImportant() {
        return false;
    }
}
