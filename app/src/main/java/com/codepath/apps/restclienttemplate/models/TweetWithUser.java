package com.codepath.apps.restclienttemplate.models;

import androidx.room.Embedded;

public class TweetWithUser {

    // @Embedded notation flattens the properties of the User object into the object, preserving encapsulation.
    @Embedded
    User user;

    // Prefix is needed to resolve ambiguity between fields: user.id and tweet.id, user.createdAt and tweet.createdAt
    @Embedded(prefix = "tweet_")
    Tweet tweet;

}
