package pageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class LeftMenuPage extends BasePage{

    public LeftMenuPage(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='menu item webview']")
    private WebElement viewOption;

    @AndroidFindBy(accessibility = "menu item log out")
    private WebElement logoutOption;

    public WebElement getViewOption() {
        return viewOption;
    }

    public WebElement getLogoutOption() {
        return logoutOption;
    }
}
