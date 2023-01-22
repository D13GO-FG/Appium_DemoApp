package pageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class CheckoutPage extends BasePage{
    public CheckoutPage(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Checkout\")")
    private WebElement titlePage;

    public WebElement getTitlePage() {
        return titlePage;
    }
}
