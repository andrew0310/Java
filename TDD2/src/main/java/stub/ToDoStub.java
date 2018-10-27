package stub;

import api.ToDo;


import java.util.Arrays;
import java.util.List;

public class ToDoStub implements ToDo {

    public List<String> retrieveToDoS(String user) {
        return Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to dance");
    }


    public void addToDo(String string, String user) {
    }

    public void deleteToDo(String toDo) {

    }
}
