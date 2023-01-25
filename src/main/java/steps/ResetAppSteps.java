package steps;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.LeftMenuPage;

import java.time.Duration;

public class ResetAppSteps extends BaseStep{
    LeftMenuPage leftMenuPage = new LeftMenuPage(driver);
    public ResetAppSteps(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    public String isAlertVisible(){
        WebElement popup = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(leftMenuPage.getAlertPopup()));
        return popup.getText();
    }

    public void clickOK(){
        WebElement btn = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(leftMenuPage.getBtnAccept()));
        btn.click();
    }
}
