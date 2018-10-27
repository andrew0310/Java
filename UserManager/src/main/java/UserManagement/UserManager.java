package UserManagement;

import FileOperator.FileOperator;
import FileOperator.LineGenerator;

import java.util.ArrayList;
import java.util.List;

public class UserManager implements LoginManager, UserEditorManager {

    private List<User> userList = new ArrayList<>();
    private User user;
    private CheckingField checkingField;
    private UserValidator userValidator;
    private LineGenerator lineGenerator;
    private FileOperator fileOperator;

    public UserManager(List<User> userList, CheckingField checkingField, UserValidator userValidator) {
        this.userList = userList;
        this.checkingField = checkingField;
        this.userValidator = userValidator;
    }

    public UserManager(List<User> userList, User user, CheckingField checkingField) {
        this.userList = userList;
        this.user = user;
        this.checkingField = checkingField;
    }

    public UserManager(List<User> userList) {
        this.userList = userList;
    }

    public UserManager(LineGenerator lineGenerator, FileOperator fileOperator) {
        this.lineGenerator = lineGenerator;
        this.fileOperator = fileOperator;
    }

    public void login(String login, String password) {

    }

    public Communicate register(User user) {

        Communicate validateResult = userValidator.validate(user);

        if (validateResult != Communicate.SUCCES) {
            return validateResult;
        }
        userList.add(user);
        return Communicate.SUCCES;
    }

    public Communicate remove(String login) {

        for (User userToRemove : userList) {
            if (!login.equals(userToRemove.getLogin())) {
                return Communicate.USER_DOESNT_EXIST;
            } else {
                userList.remove(userToRemove);
            }
        }
        return Communicate.SUCCES;
    }

    public void save() {
        List<String> lines = lineGenerator.getLinesFrom(userList);
        fileOperator.saveToFile(lines);
    }
}

