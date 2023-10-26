package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage extends BasePage {

    public void enter_valid_username_and_password(){
        WebElement loginInput=driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input"));
        //driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[1]/div/div[2]/input")).sendKeys("Admin");
        // Create an explicit wait with a timeout of 10 seconds
        WebDriverWait wait = new WebDriverWait(driver, 10);
        // Use the wait to ensure the element is clickable
        wait.until(ExpectedConditions.elementToBeClickable(loginInput));
        loginInput.sendKeys("Admin");
        driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[2]/div/div[2]/input")).sendKeys("admin123");


    }
    public void click_the_Login_buatton(){
        driver.findElement(By.xpath("//*[@id='app']/div[1]/div/div[1]/div/div[2]/div[2]/form/div[3]/button")).click();
    }

    public void Verify_dashboard(){

        WebElement dashboardText = driver.findElement(By.xpath("//*[@id='app']/div[1]/div[1]/header/div[1]/div[1]/span/h6"));
        String dashboardTextValue = dashboardText.getText();

        if (dashboardTextValue.equals("Dashboard")) {
            System.out.println("Verification Passed: Dashboard text is displayed.");
        } else {
            System.out.println("Verification Failed: Dashboard text is not displayed.");
        }
    }


}
