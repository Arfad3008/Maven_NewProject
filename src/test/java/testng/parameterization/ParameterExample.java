package testng.parameterization;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterExample {
    public WebDriver driver;

    @Parameters({"browserName"})
    @BeforeMethod
    public void beforeMethodExample(String browserName) throws InterruptedException {
        if (browserName.equalsIgnoreCase("chrome")) {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\ChromeDriver64Bit\\chromedriver-win64\\chromedriver.exe");
            driver = new ChromeDriver();
        } else if (browserName.equalsIgnoreCase("firefox")) {
            System.setProperty("webdriver.gecko.driver","C:\\Users\\user\\Downloads\\FirefoxDriver\\geckodriver.exe");
            driver = new FirefoxDriver();
        } else if (browserName.equalsIgnoreCase("edge")) {
            System.setProperty("webdriver.edge.driver", "C:\\Users\\user\\Downloads\\ChromeDriver64Bit\\chromedriver-win64\\chromedriver.exe");
            driver = new EdgeDriver();
        } else {
            throw new RuntimeException("Please select the correct browser");
        }
    } @Parameters({"courseName", "cityName"})
        @Test
        public void verifyBestInstitute(String courseName, String cityName) throws InterruptedException {
            System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\ChromeDriver64Bit\\chromedriver-win64\\chromedriver.exe");
            WebDriver driver = new ChromeDriver();
            driver.get("https://www.google.com/");
            driver.manage().window().maximize();
            WebElement searchTextBox = driver.findElement(By.name("q"));
            searchTextBox.sendKeys(courseName + " " + cityName);
            searchTextBox.sendKeys(Keys.ENTER);
            Thread.sleep(3000);
            driver.close();

        }

    }
