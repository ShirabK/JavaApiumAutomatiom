package TasksOne.Task2;

import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass{
    private int expected = 45;

    @Test
    public void testGetClassNumber () {

        if (this.getClassNumber() < expected) {
            Assert.fail("Ожидаемое значение меньше 45");
        } else if (this.getClassNumber() == expected)
        {
            Assert.fail("Ожидаемое значение равно 45");
        } else {
            Assert.assertTrue(expected < this.getClassNumber());
        }
    }

}
