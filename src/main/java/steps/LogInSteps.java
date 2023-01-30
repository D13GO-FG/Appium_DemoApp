package steps;

import io.appium.java_client.android.AndroidDriver;
import pageObjects.LogInPage;

public class LogInSteps extends BaseStep{
    LogInPage logInPage = new LogInPage(getDriver());
    public LogInSteps(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    public void typeUsername(String username){
        type(logInPage.getInputUsername(), username);
    }

    public void typePassword(String password){
        type(logInPage.getInputPassword(), password);
    }

    public void clickLogin(){
        click(logInPage.getBtnLogin());
    }

    public String msgErrorText(){
        return waitForDisplayedElement(logInPage.getMsgError(), SMALL_WAIT).getText();
    }

    public Boolean isLoginScreen(){
        return doesElementExist(logInPage.getIsLoginScreen(), SMALL_WAIT);
    }
}
