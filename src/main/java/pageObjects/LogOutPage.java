package pageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class LogOutPage extends BasePage{
    public LogOutPage(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    @AndroidFindBy(id = "android:id/alertTitle")
    private WebElement alertPopup;

    @AndroidFindBy(id = "android:id/button1")
    private WebElement btnLogOut;

    @AndroidFindBy(id = "android:id/button2")
    private WebElement btnCancel;

    public WebElement getAlertPopup() {
        return alertPopup;
    }

    public WebElement getBtnLogOut() {
        return btnLogOut;
    }

    public WebElement getBtnCancel() {
        return btnCancel;
    }
}
