package nl.r1a.task2;

public class Database extends БазаДаних {
    public String receiveUserData() {
        return отриматиДаніКористувача();
    }

    public String receiveStatistic() {
        return отриматиСтатистичніДані();
    }
}

