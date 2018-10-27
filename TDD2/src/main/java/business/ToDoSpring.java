package business;

import api.ToDo;

import java.util.ArrayList;
import java.util.List;

public class ToDoSpring {

    private ToDo toDoService;

    public ToDoSpring(ToDo toDoService) {
        this.toDoService = toDoService;
    }


    public List<String> retrieveToDoS(String user) {
        List<String> allToDos = toDoService.retrieveToDoS(user);
        List<String> filteredToDoS = new ArrayList<String>();
        for (String toDo : allToDos) {
            if (toDo.contains("Spring")) {
                filteredToDoS.add(toDo);
            }
        }
        return filteredToDoS;
    }


    public List<String> addToDo(String string, String user) {
        List<String> allToDos = toDoService.retrieveToDoS(user);
        for (String toDoS : allToDos) {
            if (!toDoS.contains("Summer")) {
                allToDos.add(toDoS);
            }
        }
        return allToDos;
    }


    public List<String> deleteToDo(String toDo) {
        List<String> allToDos = toDoService.retrieveToDoS(toDo);
        for (String toDos : allToDos) {
            if (!toDo.contains("Spring")) {
                toDoService.deleteToDo(toDos);
            }
        }
        return allToDos;
    }
}
