import api.ToDo;
import business.ToDoSpring;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.ArgumentCaptor;
import org.mockito.Captor;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import java.util.Arrays;
import java.util.List;

import static org.hamcrest.CoreMatchers.is;
import static org.mockito.BDDMockito.given;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class ToDoSpringMockitoInjectMocksTest {

    @Mock
    ToDo toDo;

    @InjectMocks
    ToDoSpring toDoSpring;

    @Captor
    ArgumentCaptor<String> stringArgumentCaptor;

    @Test
    public void usingMockito() {
        List<String> allToDos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to dance");

        when(toDo.retrieveToDoS("Andrzej")).thenReturn(allToDos);
        List<String> toDosSpring = toDoSpring.retrieveToDoS("Andrzej");
        Assert.assertEquals(2, toDosSpring.size());

    }

    @Test
    public void testUsingMockitoUsingBDD() {

        List<String> allToDos = Arrays.asList("Learn Spring MVC", "Learn Spring", "Learn to dance");

        //given
        given(toDo.retrieveToDoS("Andrzej")).willReturn(allToDos);

        //when
        List<String> toDosSpring = toDoSpring.retrieveToDoS("Andrzej");

        //then
        Assert.assertThat(toDosSpring.size(), is(2));
    }
}
