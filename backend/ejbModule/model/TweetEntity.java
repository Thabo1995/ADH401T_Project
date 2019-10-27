package model;

import java.sql.Date;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity(name = "TweetEntity")
@Table(name = "Tweet")
public class TweetEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    private int tweetID;

    private String property;

    private String tweetBody;

    private Date timeStamp;

    public TweetEntity(String property, String tweetBody, Date timeStamp) {
        this.property = property;
        this.tweetBody = tweetBody;
        this.timeStamp = timeStamp;
    }

    public int getTweetID() {
        return tweetID;
    }

    public void setTweetID(int tweetID) {
        this.tweetID = tweetID;
    }

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
}
