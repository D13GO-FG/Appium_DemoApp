package pageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class LeftMenuPage extends BasePage{

    public LeftMenuPage(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    @AndroidFindBy(accessibility = "menu item webview")
    private WebElement viewOption;

    @AndroidFindBy(accessibility = "menu item log out")
    private WebElement logoutOption;

    @AndroidFindBy(accessibility = "menu item reset app")
    private WebElement resetOption;

    @AndroidFindBy(id = "android:id/alertTitle")
    private WebElement alertPopup;

    @AndroidFindBy(id = "android:id/button1")
    private WebElement btnAccept;

    @AndroidFindBy(id = "android:id/button2")
    private WebElement btnCancel;

    public WebElement getViewOption() {
        return viewOption;
    }

    public WebElement getLogoutOption() {
        return logoutOption;
    }

    public WebElement getResetOption() {
        return resetOption;
    }

    public WebElement getAlertPopup() {
        return alertPopup;
    }

    public WebElement getBtnAccept() {
        return btnAccept;
    }

    public WebElement getBtnCancel() {
        return btnCancel;
    }
}
