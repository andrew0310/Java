package singleton;

public class Main {
    public static void main(String[] args) {

        Singleton s = Singleton.getInstance();
        s.getLogin();
        s.getPassword();

        MySingleton ms = MySingleton.getInstance();
        System.out.println(ms.getName());
        System.out.println(ms.getSurname());
    }
}
