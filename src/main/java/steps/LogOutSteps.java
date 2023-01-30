package steps;

import io.appium.java_client.android.AndroidDriver;
import pageObjects.LeftMenuPage;

public class LogOutSteps extends BaseStep{
    LeftMenuPage leftMenuPage = new LeftMenuPage(getDriver());
    public LogOutSteps(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    public String isAlertVisible(){
        return waitForDisplayedElement(leftMenuPage.getAlertPopup(), SMALL_WAIT).getText();
    }

    public void clickOK(){
        click(leftMenuPage.getBtnAccept());
    }

    public void clickCancel(){
        click(leftMenuPage.getBtnCancel());
    }
}
