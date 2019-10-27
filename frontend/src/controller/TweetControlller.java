package controller;


import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ManagedProperty;
import javax.faces.bean.SessionScoped;

import model.Twitter;
import service.TweetService;
import service.TweetServiceImpl;

@ManagedBean(name="twittercontroller")
@SessionScoped
public class TweetControlller {

@EJB
TweetServiceImpl tweetserviceimpl;
TweetService tweetservice;
@ManagedProperty(value="#{twitter}")
private Twitter tweet;


public void postTweet() {
	
	System.out.println("testing twitter");
	tweetserviceimpl.postTweet(null);
}
public Twitter getTweet() {
	return tweet;
}

public void setTweet(Twitter tweet) {
	this.tweet = tweet;
}


}