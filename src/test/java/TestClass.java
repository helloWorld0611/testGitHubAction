import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class TestClass {

    @BeforeClass
    public void before(){
        System.out.println("\tBEFORE CLASS\t");
    }
    @Test
    public void test(){
        System.out.println("\n\n\t\tTEST IS DONE\t\t\n\n");
    }

    @AfterClass
    public void after(){
        System.out.println("\tAFTER CLASS\t");
    }
}
