package model;

import java.util.Date;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;


@ManagedBean(name="twitter")
@SessionScoped
public class Twitter {

	  private String property;

       private String tweetBody;

	    private Date timeStamp;

		public String getProperty() {
			return property;
		}

		public void setProperty(String property) {
			this.property = property;
		}

		public String getTweetBody() {
			return tweetBody;
		}

		public void setTweetBody(String tweetBody) {
			this.tweetBody = tweetBody;
		}

		public Date getTimeStamp() {
			return timeStamp;
		}

		public void setTimeStamp(Date timeStamp) {
			this.timeStamp = timeStamp;
		}
	
		public TweetEntity getEntity() {
			TweetEntity tweetentity = new TweetEntity(property, property, null);
			tweetentity.setProperty(property);
			//tweetentity.setTimeStamp(timeStamp);
			tweetentity.setTweetBody(tweetBody);
			//tweetentity.setTweetID(tweetID);
			return tweetentity;
			
		}
}
