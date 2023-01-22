package steps;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.CheckoutPage;

import java.time.Duration;

public class CheckoutSteps extends BaseStep{
    CheckoutPage checkoutPage =  new CheckoutPage(driver);
    public CheckoutSteps(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    public boolean isTitleVisible(){
        WebElement title = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(checkoutPage.getTitlePage()));
        return title.isDisplayed();
    }
}
