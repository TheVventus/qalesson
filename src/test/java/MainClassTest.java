import org.junit.Assert;
import org.junit.Test;

public class MainClassTest extends MainClass {

    @Test
    public void testGetLocalNumber() {
        Assert.assertTrue("Тест не равен 14",this.getLocalNumber() == 14);
    }

    @Test public void testGetClassNumber() {
        Assert.assertTrue("Тестовое значение равно не больше 45",this.getClassNumber() > 45);
    }
}
