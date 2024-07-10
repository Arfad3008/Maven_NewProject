package testng;
import org.testng.annotations.Test;
//By default it Executes in Alphabetical order
public class PriorityInTextCaseExample {
    @Test(priority = -20)
    public void nameTestCase_D()
    { System.out.println("Test_D");
    }
    @Test //(priority = 4) it will execute default(0) priority 1st
    public void nameTestCase_H()
    { System.out.println("Test_H");
    }
   @Test /*(priority = 3) if we have multiple default testCase,it will
                 execute that default tesCase based on the priority*/
    public void nameTestCase_A()
    { System.out.println("Test_A");
    }
    @Test(priority = 1)
    public void nameTestCase_Z()
    { System.out.println("Test_Z");
    }
    @Test(priority = -1)
    public void nameTestCase_K()
    { System.out.println("Test_K");
    }
    @Test(priority = -1,groups={"smoke"})
    public void nameTestCase_T()
    { System.out.println("Test_T");
    }
    @Test(priority = 'A')
    public void nameTestCase_N()
    { System.out.println("Test_N");
    }
}
