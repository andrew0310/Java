package singleton;

public final class MySingleton {

    private String name;
    private String surname;
    private static MySingleton instance = new MySingleton("Andrzej", "Kraszewski");

    private MySingleton(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public static MySingleton getInstance() {
        return instance;
    }
}
