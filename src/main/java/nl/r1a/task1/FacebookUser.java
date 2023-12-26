package nl.r1a.task1;

import lombok.Getter;

@Getter
public class FacebookUser {
    private String mail;
    private String userCountry;
    private Integer userActiveTime;

    public FacebookUser(String mail, String userCountry,
                        Integer userActiveTime) {
        this.mail = mail;
        this.userCountry = userCountry;
        this.userActiveTime = userActiveTime;
    }
}
