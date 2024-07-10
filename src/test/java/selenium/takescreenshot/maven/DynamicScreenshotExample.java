package selenium.takescreenshot.maven;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DynamicScreenshotExample {
    public static void main(String[] args) throws InterruptedException, IOException {
        System.setProperty("webdriver.chrome.driver", "C:\\Users\\user\\Downloads\\ChromeDriver64Bit\\chromedriver-win64\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://x.com/?lang=en");
        driver.manage().window().maximize();
        File src = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        Thread.sleep(3000);
       File dest= new File("C:\\Users\\user\\Desktop\\ScreenShotInterface\\Screenshot (528)_"+timestamp()+".png");
        FileUtils.copyFile(src,dest);
        driver.close();
    }
    public static String timestamp(){
        return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
    }
}