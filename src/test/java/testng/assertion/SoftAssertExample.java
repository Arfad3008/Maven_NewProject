package testng.assertion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;
import testng.failedtestcase.FailedTestScriptRuns;

public class SoftAssertExample {
    @Test
    public void verifySoftAssertStatement_1()
    {
        SoftAssert softAssert=new SoftAssert();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\ChromeDriver64Bit\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
      driver.manage().window().maximize();

        driver.findElement(By.xpath("//u[text()='Create a new account']")).click();
        String pageText= driver.findElement(By.xpath("//td[text()='Create a Rediffmail account']")).getText();
        softAssert.assertEquals(pageText,"create a Rediffmail account","Text Should be Create a Rediffmail account");
        WebElement userNameTextBox=driver.findElement(By.xpath("//input[starts-with(@name,'name')]"));
        softAssert.assertTrue(userNameTextBox.isDisplayed(),"User Name Text Box Should be displayed");
        softAssert.assertAll();
        driver.close();
    }
    @Test
    public void verifySoftAssertStatement_2() {
        SoftAssert softAssert = new SoftAssert();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\ChromeDriver64Bit\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.snapdeal.com/");
        driver.manage().window().maximize();
        driver.close();
    }

    @Test
    public void verifySoftAssertStatement_3()
    {
        SoftAssert softAssert=new SoftAssert();
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\ChromeDriver64Bit\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://x.com/?lang=en");
        driver.manage().window().maximize();
        driver.close();

    }
}

