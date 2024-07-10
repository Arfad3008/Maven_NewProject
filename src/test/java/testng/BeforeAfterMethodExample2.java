package testng;
import org.testng.annotations.*;
public class BeforeAfterMethodExample2 {
    @BeforeClass
    public void beforeClass()
    { System.out.println("Before Class");
    }
    @BeforeMethod
    public void beforeMethod()
    { System.out.println("Before Method");
    }
    @Test
    public void nameTest_1()
    { System.out.println("nameTest_1");
    }
    @Test(enabled = false)
    public void nameTest_2()
    { System.out.println("nameTest_2");
    }
    @Test
    public void nameTest_3()
    { System.out.println("nameTest_3");
    }
    @AfterMethod
    public void afterMethod()
    { System.out.println("After Method");
    }
    @AfterClass
    public void afterClass()
    {System.out.println("After Class");
    }
}
