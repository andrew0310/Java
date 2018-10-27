import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import java.util.Arrays;
import java.util.Collection;


@RunWith(Parameterized.class)
public class CalcParametrizedByFieldsTest {

    private Calculator calculator;

    @Parameterized.Parameter(value = 0)
    public int numberA;

    @Parameterized.Parameter(value = 1)
    public int numberB;

    @Parameterized.Parameter(value = 2)
    public int expected;

    @Parameterized.Parameters(name = "{index}: testAdd({0}+{1}) = {2}")
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {1, 1, 2},
                {2, 2, 4}
        });
    }

    @Before
    public void setCalculator() {
        this.calculator = new Calculator();
    }

    @Test
    public void testAdd() {
        Assert.assertEquals(expected, calculator.add(numberA, numberB));
    }

    @Test
    public void divideTest(){
        Assert.assertEquals(0, calculator.divide(0,2));
    }
}
