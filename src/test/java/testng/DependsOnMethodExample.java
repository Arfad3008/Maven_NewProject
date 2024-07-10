package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnMethodExample {
    @Test
    public void verifyLogin()
    {
        Assert.assertTrue(false);
        System.out.println("Verify Login");
    }
    @Test(groups={"smoke"})
    public void createANewUser()
    {
        System.out.println("create A New User");
    }
    @Test(dependsOnMethods ="verifyLogin",alwaysRun=true)
    public void fundTransfer()
    {
        System.out.println("Fund Transfer");
    }
}
