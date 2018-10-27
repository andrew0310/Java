package singleton;

public final class Singleton {

    private String login;
    private String password;
    private static Singleton instance = new Singleton("andrzej.kraszewski", "123456");

    private Singleton() {
    }

    private Singleton(String login, String password) {
        this.login = login;
        this.password = password;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public static Singleton getInstance() {
        return instance;
    }
}
