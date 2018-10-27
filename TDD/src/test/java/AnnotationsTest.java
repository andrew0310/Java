import org.junit.*;

import java.util.ArrayList;
import java.util.concurrent.TimeUnit;

public class AnnotationsTest {

    private ArrayList testList;

    @BeforeClass
    public static void onceExecuteBeforeAll() {
        System.out.println("@BeforeAll -------");
    }

    @Before
    public void executesBeforeEach() {
        System.out.println("@Before --------");
        testList = new ArrayList();
    }

    @Test
    public void test() {

        String obj1 = "jUnit";
        String obj2 = "jUnit";
        String obj3 = "Test";
        String obj5 = null;
        int var1 = 1;
        int var2 = 2;
        int[] arithmetic1 = {1, 2, 3};
        int[] arithmetic2 = {1, 2, 3};

        Assert.assertEquals(obj1, obj2);
        Assert.assertNull(obj5);
        Assert.assertNotSame(obj1, obj3);
        Assert.assertArrayEquals(arithmetic1, arithmetic2);
    }

    @Test
    public void emptyCollection() {
        Assert.assertTrue(testList.isEmpty());
        System.out.println("@Test emptyCollection --------");
    }

    @Test(timeout = 2100)
    public void oneItemCollection() throws InterruptedException {
        testList.add("hey");
        TimeUnit.SECONDS.sleep(2);
        Assert.assertFalse(testList.isEmpty());
        Assert.assertEquals(1, testList.size());
        System.out.println("@Test oneItemCollection -------");
    }

    @After
    public void executeAfterAll() {
        System.out.println("@After -------");
    }

    @AfterClass
    public static void onceExecuteAfterAll() {
        System.out.println("@AfterClass -------");
    }
}
