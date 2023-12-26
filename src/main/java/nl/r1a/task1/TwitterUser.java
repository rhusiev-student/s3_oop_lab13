package nl.r1a.task1;

import lombok.Getter;

@Getter
public class TwitterUser {
    private String userMail;
    private String country;
    private Integer lastActiveTime;

    public TwitterUser(String userMail, String country,
                       Integer lastActiveTime) {
        this.userMail = userMail;
        this.country = country;
        this.lastActiveTime = lastActiveTime;
    }
}
