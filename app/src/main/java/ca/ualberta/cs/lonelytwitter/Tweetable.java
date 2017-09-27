/*
 * Tweetable
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
 * Interface for 'tweetable' objects
 *
 * @author atsmith
 * @version 1.0
 */
public interface Tweetable {

    String getMessage();
    Date getDate();
}
