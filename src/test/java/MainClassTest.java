import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {

    @Test
    public void testGetLocalNumber() {
        Assert.assertTrue("Тест не равен 14",this.getLocalNumber() == 14);
    }

    @Test
    public void testGetClassNumber() {
        Assert.assertTrue("Тестовое значение равно не больше 45",this.getClassNumber() > 45);
    }
    @Test
    public void testGetClassString () {
        String testStr1 = "hello";
        String testStr2 = "Hello";
        if (this.getClassString().contains(testStr1) || this.getClassString().contains(testStr2)) {
            System.out.println("Строка не содержит 'hello'  или 'Hello'");
        } else {
            Assert.fail("Строка не содержит 'hello'  или 'Hello'");
        }
    }
}
