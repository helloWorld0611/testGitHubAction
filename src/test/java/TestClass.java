import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.Random;

public class TestClass {

    Random rd = new Random();


    @Test
    public void test1(){
        Assert.assertTrue(rd.nextBoolean());
    }

    @Test
    public void test2(){
        Assert.assertTrue(rd.nextBoolean());
    }

    @Test
    public void test3(){
        Assert.assertTrue(rd.nextBoolean());
    }

    @Test
    public void test4(){
        Assert.assertTrue(rd.nextBoolean());
    }

    @Test
    public void test5(){
        Assert.assertTrue(rd.nextBoolean());
    }
}
