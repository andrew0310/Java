import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    @Before
    public void setUp(){

    }

    @Test
    public void shouldReturn4When2Add2(){

        //given
        Calculator calculator = new Calculator();
        //when
        int result = calculator.add(2,2);
        //then
        Assert.assertEquals(4, result);
    }
}
