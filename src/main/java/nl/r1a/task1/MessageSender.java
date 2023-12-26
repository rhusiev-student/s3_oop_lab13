package nl.r1a.task1;

public class MessageSender {
    public boolean send(String text, MyUser user, String country) {
        Integer currentTimeUnix = (int) (System.currentTimeMillis() / 1000L);
        if (user.getLastActiveTime() > currentTimeUnix - 3600
            && user.getCountry().equals(country)) {
            System.out.println("Sending message '" + text + "' to "
                               + user.getMail());
            return true;
        }
        return false;
    }
}
