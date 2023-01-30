package steps;

import io.appium.java_client.android.AndroidDriver;
import pageObjects.CheckoutPage;

public class CheckoutSteps extends BaseStep{
    CheckoutPage checkoutPage =  new CheckoutPage(getDriver());
    public CheckoutSteps(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    public boolean isTitleVisible(){
        return doesElementExist(checkoutPage.getTitlePage(), SMALL_WAIT);
    }
}
