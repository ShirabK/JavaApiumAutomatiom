package TasksOne.Task1;

import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass{

    private int expected = 14;

    @Test
    public void MainClassTest() {
        Assert.assertTrue("Ожидаемой значение не равно 14", expected == this.getLocaleNumber());
    }
}
