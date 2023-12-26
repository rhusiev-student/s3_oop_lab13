package nl.r1a.task1;

public class MyTwitterUser implements MyUser {
    public TwitterUser twitterUser;

    public MyTwitterUser(TwitterUser twitterUser) {
        this.twitterUser = twitterUser;
    }

    @Override
    public String getMail() {
        return twitterUser.getUserMail();
    }

    @Override
    public String getCountry() {
        return twitterUser.getCountry();
    }

    @Override
    public Integer getLastActiveTime() {
        return twitterUser.getLastActiveTime();
    }
}
