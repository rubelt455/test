package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class BasePage {
    public static WebDriver driver;
    public void openChromeBrowser(){
        String url="https://opensource-demo.orangehrmlive.com/web/index.php/auth/login";
        System.setProperty(
                "webdriver.chrome.driver",
                "C:\\Users\\rubel\\Documents\\workspace-original\\CucumberJava\\chromedriver.exe");
        // Instantiate a ChromeDriver class.driver = new ChromeDriver();
        driver=new ChromeDriver();
        driver.get(url);
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
    }
}
