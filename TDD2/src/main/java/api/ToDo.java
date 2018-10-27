package api;

import java.util.List;

public interface ToDo {

    List<String> retrieveToDoS(String user);

    void addToDo (String string, String user);

    void deleteToDo(String toDo);
}
