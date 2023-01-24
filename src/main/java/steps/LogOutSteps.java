package steps;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.LogOutPage;

import java.time.Duration;

public class LogOutSteps extends BaseStep{
    LogOutPage logOutPage = new LogOutPage(driver);
    public LogOutSteps(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    public String isAlertVisible(){
        WebElement popup = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(logOutPage.getAlertPopup()));
        return popup.getText();
    }

    public void clickLogOut(){
        WebElement btn = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(logOutPage.getBtnLogOut()));
        btn.click();
    }

    public void clickCancel(){
        WebElement btn = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(logOutPage.getBtnCancel()));
        btn.click();
    }
}
