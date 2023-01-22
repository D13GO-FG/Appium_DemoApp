package pageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class LogInPage extends BasePage{
    public LogInPage(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    @AndroidFindBy(accessibility = "Username input field")
    private WebElement inputUsername;

    @AndroidFindBy(accessibility = "Password input field")
    private WebElement inputPassword;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"Login button\"]")
    private WebElement btnLogin;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc=\"generic-error-message\"]/android.widget.TextView")
    private WebElement msgError;
    public WebElement getInputUsername() {
        return inputUsername;
    }

    public WebElement getInputPassword() {
        return inputPassword;
    }

    public WebElement getBtnLogin() {
        return btnLogin;
    }

    public WebElement getMsgError() {
        return msgError;
    }
}
