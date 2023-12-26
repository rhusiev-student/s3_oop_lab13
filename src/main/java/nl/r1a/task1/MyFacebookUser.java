package nl.r1a.task1;

public class MyFacebookUser implements MyUser {
    public FacebookUser facebookUser;

    public MyFacebookUser(FacebookUser facebookUser) {
        this.facebookUser = facebookUser;
    }

    @Override
    public String getMail() {
        return facebookUser.getMail();
    }

    @Override
    public String getCountry() {
        return facebookUser.getUserCountry();
    }

    @Override
    public Integer getLastActiveTime() {
        return facebookUser.getUserActiveTime();
    }
}
