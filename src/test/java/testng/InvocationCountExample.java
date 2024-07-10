package testng;

import org.testng.annotations.Test;

public class InvocationCountExample {
    @Test(invocationCount = 3,invocationTimeOut = 1)
    public void invocationCountExample()
    {
        System.out.println("Demo for invocation");
    }
}
