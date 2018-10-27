import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class JParamsTest {
    private Calculator calculator;

    @Before
    public void init() {
        this.calculator = new Calculator();
    }

    @Test
    @Parameters({

            "1, 1, 2",
            "2, 2, 4"
    })

    public void testAdd(int inputNumberA, int inputNumberB, int expectedResult) {
        Assert.assertEquals(expectedResult, calculator.add(inputNumberA, inputNumberB));
    }
}
