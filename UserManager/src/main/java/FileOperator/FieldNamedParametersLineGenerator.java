package FileOperator;

import UserManagement.User;

import java.util.ArrayList;
import java.util.List;

public class FieldNamedParametersLineGenerator implements LineGenerator {

    @Override
    public List<String> getLinesFrom(List<User> userList) {

        List<String> lines = new ArrayList<>();
        for (User user : userList) {
            lines.add(toLine(user));
        }
        return lines;
    }

    private String toLine(User user) {

        String result = "FirstName: " + user.getName() +
                ", Surname: " + user.getSurname() +
                ", E-mail: " + user.getEmail() +
                ", Login: " + user.getLogin() +
                ", Password: " + user.getPassword() +
                ", Id: " + user.getId();
        return result;
    }
}
