package steps;

import io.appium.java_client.android.AndroidDriver;
import pageObjects.LeftMenuPage;

public class LeftMenuSteps extends BaseStep{
    LeftMenuPage leftMenuPage = new LeftMenuPage(getDriver());

    public LeftMenuSteps(AndroidDriver androidDriver) {
        super(androidDriver);
    }
    public void clickWebViewOption(){
        click(leftMenuPage.getViewOption());
    }

    public void clickLogOutOption(){
        click(leftMenuPage.getLogoutOption());
    }

    public void clickResetOption(){
        click(leftMenuPage.getResetOption());
    }

    public Boolean isLogOutVisible(){
        return doesElementExist(leftMenuPage.getLogoutOption(), SMALL_WAIT);
    }
}
