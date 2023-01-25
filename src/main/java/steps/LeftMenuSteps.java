package steps;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.LeftMenuPage;

import java.time.Duration;

public class LeftMenuSteps extends BaseStep{
    LeftMenuPage leftMenuPage = new LeftMenuPage(driver);

    public LeftMenuSteps(AndroidDriver androidDriver) {
        super(androidDriver);
    }
    public void clickWebViewOption(){
        WebElement clickOption = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(leftMenuPage.getViewOption()));
        clickOption.click();
    }

    public void clickLogOutOption(){
        WebElement option = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(leftMenuPage.getLogoutOption()));
        option.click();
    }

    public void clickResetOption(){
        WebElement option = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(leftMenuPage.getResetOption()));
        option.click();
    }

    public Boolean isLogOutVisible(){
        WebElement option = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(leftMenuPage.getLogoutOption()));
        return option.isDisplayed();
    }
}
