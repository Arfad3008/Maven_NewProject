package testng;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class BeforeAfterMethodExample {
    WebDriver driver;
    @BeforeMethod
    public void beforeMethodExample() {
        System.out.println("Executes Before method");
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\ChromeDriver64Bit\\chromedriver-win64\\chromedriver.exe");
       driver = new ChromeDriver();
    }
    @Test
        public void testCase1() {
        System.out.println("testCase1");
            driver.get("https://www.snapdeal.com/");
            driver.manage().window().maximize();
        }
        @Test
        public void testCase2() {
            System.out.println("testCase2");
            driver.get("https://x.com/?lang=en");
            driver.manage().window().maximize();
        }
        @AfterMethod
    public void afterMethodExample(){
            System.out.println("Executes After method");
        driver.close();
    }
}
