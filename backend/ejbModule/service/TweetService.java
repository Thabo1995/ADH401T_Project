package service;

import java.util.List;

import javax.ejb.Local;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;


import model.TweetEntity;
import twitter4j.Status;

/**
 * Session Bean implementation class TweetService
 */
@Stateless
@LocalBean
@Local

public interface TweetService {
	
	
 TweetEntity postTweet(TweetEntity tweetentity);

	 List<TweetEntity> retrieveTweets();
	    
  Status createTweet(String tweetentity);

}


