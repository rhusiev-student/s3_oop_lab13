package nl.r1a.task1;

public class Main {
    public static void main(String[] args) {
        Integer currentTimeUnix = (int) (System.currentTimeMillis() / 1000L);
        TwitterUser twitterUser = new TwitterUser("nicemail@gmail.com",
                "Netherlands", currentTimeUnix - 1000);
        TwitterUser twitterUser1 = new TwitterUser("nicemail1@gmail.com",
                "Netherlands", currentTimeUnix - 20000);
        FacebookUser facebookUser = new FacebookUser("nicemail2@gmail.com",
                "Australia", currentTimeUnix - 2000);
        FacebookUser facebookUser1 = new FacebookUser("nicemail3@gmail.com",
                "Netherlands", currentTimeUnix - 2000);
        MyTwitterUser myTwitterUser = new MyTwitterUser(twitterUser);
        MyTwitterUser myTwitterUser1 = new MyTwitterUser(twitterUser1);
        MyFacebookUser myFacebookUser = new MyFacebookUser(facebookUser);
        MyFacebookUser myFacebookUser1 = new MyFacebookUser(facebookUser1);
        MessageSender messageSender = new MessageSender();
        messageSender.send("Hello", myTwitterUser, "Netherlands");
        messageSender.send("Hello", myTwitterUser1, "Netherlands");
        messageSender.send("Hello", myFacebookUser, "Netherlands");
        messageSender.send("Hello", myFacebookUser1, "Netherlands");
    }
}
