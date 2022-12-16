package TasksOne.Task3;

import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass{

    @Test
    public void testGetClassString () {
        String str = this.getClassString();

        boolean result = false;

        int word1 = str.indexOf("hello");
        int word2 = str.indexOf("Hello");

        if (word1 == -1 && word2 == -1) {
            result = false;
        } else {
            result = true;
        }

        Assert.assertTrue("Строка не содержит подстрок Hello или hello", result == true);
    }
}
