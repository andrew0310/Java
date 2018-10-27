import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class BowlingTest {

    private Bowling bowling;

    private void rollSameNumberOfPinsEachTime(int pins, int times) {
        for (int i = 0; i < times; i++) {
            bowling.roll(pins);
        }
    }

    @Before
    public void init() {
        bowling = new Bowling();
    }

    @Test
    public void testAllZeros() {
        rollSameNumberOfPinsEachTime(0, 20);
        Assert.assertEquals(0, bowling.score());
    }

    @Test
    public void testAllOnes() {
        rollSameNumberOfPinsEachTime(1, 20);
        Assert.assertEquals(20, bowling.score());
    }

    @Test
    public void testSpare() {
        rollSameNumberOfPinsEachTime(0, 16);
        bowling.roll(9);
        bowling.roll(1);
        bowling.roll(2);
        bowling.roll(3);
        Assert.assertEquals(17, bowling.score());
    }

    @Test
    public void testSpareOnEnd() {
        rollSameNumberOfPinsEachTime(0, 18);
        bowling.roll(9);
        bowling.roll(1);
        bowling.roll(2);
        Assert.assertEquals(12, bowling.score());
    }

    @Test
    public void testStrike() {
        rollSameNumberOfPinsEachTime(0, 16);
        bowling.roll(10);
        bowling.roll(2);
        bowling.roll(3);
        Assert.assertEquals(20, bowling.score());
    }

    @Test
    public void testStrikeOnEnd() {
        rollSameNumberOfPinsEachTime(0, 18);
        bowling.roll(10);
        bowling.roll(2);
        Assert.assertEquals(12, bowling.score());
    }

    @Test
    public void testAllStrikes() {
        bowling.roll(10);
        bowling.roll(10);
        bowling.roll(10);
        bowling.roll(10);
        bowling.roll(10);
        bowling.roll(10);
        bowling.roll(10);
        bowling.roll(10);
        bowling.roll(10);
        bowling.roll(10);
        bowling.roll(10);
        Assert.assertEquals(290, bowling.score());
    }

    @Test
    public void testCustom() {
        bowling.roll(2);
        bowling.roll(3);
        bowling.roll(10);
        bowling.roll(10);
        bowling.roll(5);
        bowling.roll(5);
        bowling.roll(5);
        bowling.roll(5);
        bowling.roll(10);
        bowling.roll(0);
        bowling.roll(0);
        bowling.roll(0);
        bowling.roll(10);
        bowling.roll(7);
        bowling.roll(3);
        bowling.roll(10);
        bowling.roll(1);
        Assert.assertEquals(143, bowling.score());
    }

}
