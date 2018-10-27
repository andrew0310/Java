package FileOperator;

import UserManagement.User;
import java.util.List;

public interface LineGenerator {

    List<String> getLinesFrom(List<User> userList);
}
