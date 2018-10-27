package UserManagement;

public class User {

    private String name;
    private String surname;
    private String email;
    private String login;
    private String password;
    private int id;

    public User(String name, String surname, String email, String login, String password, int id) {
        this.name = name;
        this.surname = surname;
        this.email = email;
        this.login = login;
        this.password = password;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getEmail() {
        return email;
    }

    public String getLogin() {
        return login;
    }

    public String getPassword() {
        return password;
    }

    public int getId() {
        return id;
    }
}
