package UserManagement;

public interface UserEditorManager {

    Communicate register(User user);

    Communicate remove(String login);
}
