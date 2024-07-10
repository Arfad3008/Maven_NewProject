package testng;

import org.testng.Assert;
import org.testng.annotations.Test;

public class DependsOnGroupExample {

    @Test(groups={"smoke"})
    public void verifyFundTransfer()
    {
       // Assert.assertTrue(false);
        System.out.println("verifyFundTransfer");
    }
    @Test(groups ={"smoke"})
    public void verifyFundTransferWithSaving()
    {

        System.out.println("verify FundTransfer With Saving");
    }
    @Test
    public void verifyCashbackOffer()
    {
        System.out.println("verify CashBack Offer");
    }
}

