import api.ToDo;
import business.ToDoSpring;
import org.junit.Assert;
import org.junit.Test;
import stub.ToDoStub;

import java.util.List;

public class ToDoSpringStubTest {

    @Test
    public void testUsingStub() {
        ToDo toDo = new ToDoStub();
        ToDoSpring toDoSpring = new ToDoSpring(toDo);
        List<String> todos = toDoSpring.retrieveToDoS("Andrzej");
        Assert.assertEquals(2, todos.size());
    }


    @Test
    public void testUsingStub1(){
        ToDo toDo = new ToDoStub();
        ToDoSpring toDoSpring = new ToDoSpring(toDo);
        List<String> todos = toDoSpring.retrieveToDoS("Andrzej");
        Assert.assertNotEquals(3, todos.size());
    }
}
