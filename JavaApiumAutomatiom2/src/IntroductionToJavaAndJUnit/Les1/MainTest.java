package IntroductionToJavaAndJUnit.Les1;

import org.junit.Test;

public class MainTest extends CoreTestCase{

    public MainTest() {
    }

    public void typeStartMessage() {
        super.typeStartMessage();
        System.out.println("Current class is MainTest");
    }

    @Test
    public void ClassTest() {
        this.typeStartMessage();
    }

    @Test
    public void SuperClassTest() {
        this.typeStartMessage();
    }
}
