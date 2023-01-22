package steps;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.LogInPage;

import java.time.Duration;

public class LogInSteps extends BaseStep{
    LogInPage logInPage = new LogInPage(driver);
    public LogInSteps(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    public void typeUsername(String username){
        WebElement input = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(logInPage.getInputUsername()));
        input.sendKeys(username);
    }

    public void typePassword(String password){
        WebElement input = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(logInPage.getInputPassword()));
        input.sendKeys(password);
    }

    public void clickLogin(){
        WebElement btn = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(logInPage.getBtnLogin()));
        btn.click();
    }

    public String msgErrorText(){
        WebElement msgError = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(logInPage.getMsgError()));
        return msgError.getText();
    }
}
