package testng;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
public class TestNGExample {
    @Test
    public void testCase1() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\ChromeDriver64Bit\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.snapdeal.com/");
        driver.manage().window().maximize();
        driver.close();
    }
    @Test
    public void testCase2() {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\ChromeDriver64Bit\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://x.com/?lang=en");
        driver.manage().window().maximize();
        driver.close();
    }
}