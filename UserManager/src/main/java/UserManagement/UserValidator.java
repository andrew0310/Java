package UserManagement;

import java.util.List;

public class UserValidator {

    private List<User> userList;
    private CheckingField checkingField;

    public UserValidator(List<User> userList, CheckingField checkingField) {
        this.userList = userList;
        this.checkingField = checkingField;
    }

    public Communicate validate(User user) {

        if ((checkingField.fieldIsNotOk(user.getLogin()) == true ||
                checkingField.fieldIsNotOk(user.getPassword()) == true ||
                checkingField.fieldIsNotOk(user.getName()) == true ||
                checkingField.fieldIsNotOk(user.getSurname()) == true ||
                checkingField.fieldIsNotOk(user.getEmail()) == true ||
                checkingField.fieldIsNotOk(user.getId()))) {

            return Communicate.FIELDS_MISSING;
        } else {

            for (User user1 : userList) {
                if (user.getEmail() == user1.getEmail()) {
                    return Communicate.USER_ALREADY_EXIST;
                }
            }
            return Communicate.SUCCES;
        }
    }
}