import api.ToDo;
import business.ToDoSpring;
import org.junit.Assert;
import org.junit.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.when;


public class ToDoSpringMockitoTest {

    @Test
    public void testUsingMockito() {

        ToDo toDo = mock(ToDo.class);
        ToDoSpring toDoSpring = new ToDoSpring(toDo);
        List<String> allToDoS = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to dance");
        List<String> allToDoS1 = Arrays.asList("Learn Spring MVC", "Learn Spring");

        when(toDo.retrieveToDoS("Andrzej")).thenReturn(allToDoS);
        when(toDo.retrieveToDoS("Krzysztof")).thenReturn(allToDoS1);

        List<String> toDosSpring = toDoSpring.retrieveToDoS("Andrzej");
        Assert.assertEquals(2, toDosSpring.size());
        List<String> toDosSpring1 = toDoSpring.retrieveToDoS("Krzysztof");
        Assert.assertEquals(2, toDosSpring1.size());
    }

    @Test
    public void testUsingMockitoUsingBDD() {
        ToDo toDo = mock(ToDo.class);
        ToDoSpring toDoSpring = new ToDoSpring(toDo);
        List<String> allToDos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to dance");

        //given
        given(toDo.retrieveToDoS("Andrzej")).willReturn(allToDos);

        //when
        List<String> toDosSpring = toDoSpring.retrieveToDoS("Andrzej");

        //then
        Assert.assertThat(toDosSpring.size(), is(2));
    }

    @Test
    public void testDeleteNow() {

        ToDo toDo = mock(ToDo.class);
        List<String> allToDos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to dance");

        when(toDo.retrieveToDoS("Andrzej")).thenReturn(allToDos);
        ToDoSpring toDoSpring = new ToDoSpring(toDo);
        toDoSpring.deleteToDo("Andrzej");

        verify(toDo).deleteToDo("Learn to dance");
        verify(toDo, Mockito.never()).deleteToDo("Learn Spring MVC");
        verify(toDo, Mockito.never()).deleteToDo("Learn Spring");

        verify(toDo, Mockito.times(1)).deleteToDo("Learn to dance");
    }


    @Test
    public void testAdd() {
        ToDoSpring toDo = mock(ToDoSpring.class);
        List<String> allToDos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to dance");

        when(toDo.addToDo("Słońce", "Andrzej")).thenReturn(allToDos);
        Assert.assertEquals(4, allToDos.size());
    }

    @Test
    public void testCaptorArgument() {
        ArgumentCaptor<String> argumentCaptor = ArgumentCaptor.forClass(String.class);

        ToDo todoService = mock(ToDo.class);

        List<String> allToDos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to dance");
        Mockito.when(todoService.retrieveToDoS("Andrzej")).thenReturn(allToDos);

        ToDoSpring toDoSpring = new ToDoSpring(todoService);
        toDoSpring.deleteToDo("Andrzej");
        verify(todoService).deleteToDo(argumentCaptor.capture());

        Assert.assertEquals("Learn to dance", argumentCaptor.getValue());
    }
}
