package IntroductionToJavaAndJUnit.Assert;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class MainTest {

    public MainTest() {
    }

    @Before
    public void testStartTest() {
        System.out.println("Start test");
    }

    @After
    public void testFinishTest() {
        System.out.println("FinishTest");
    }

    @Test
    public void firstTest() {
        System.out.println("first test run");
    }

    @Test
    public void secondTest() {
        System.out.println("second test run");
    }

}
