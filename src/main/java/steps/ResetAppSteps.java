package steps;

import io.appium.java_client.android.AndroidDriver;
import pageObjects.LeftMenuPage;


public class ResetAppSteps extends BaseStep{
    LeftMenuPage leftMenuPage = new LeftMenuPage(getDriver());
    public ResetAppSteps(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    public String isAlertVisible(){
        return waitForDisplayedElement(leftMenuPage.getAlertPopup(), SMALL_WAIT).getText();
    }

    public void clickOK(){
        click(leftMenuPage.getBtnAccept());
    }
}
