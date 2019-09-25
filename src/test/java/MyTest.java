import org.junit.Assert;
import org.junit.Test;

public class MyTest {

    @Test
    public void testDiv(){
        Assert.assertEquals(10 , 5 /5);
    }

    @Test
    public void testAdd(){
        Assert.assertEquals(10 , 5 + 5);
    }
    @Test
    public void testSub(){
        Assert.assertEquals(10 , 5 - 5);
    }
    @Test
    public void testMulti(){
        Assert.assertEquals(10 , 5 * 5);
    }
}
