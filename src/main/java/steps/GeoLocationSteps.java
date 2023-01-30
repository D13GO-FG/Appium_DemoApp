package steps;

import io.appium.java_client.android.AndroidDriver;
import pageObjects.GeoLocationPage;

public class GeoLocationSteps extends BaseStep{
    GeoLocationPage geoLocationPage = new GeoLocationPage(getDriver());
    public GeoLocationSteps(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    public boolean getTitlePage(){
        return doesElementExist(geoLocationPage.getTitlePage(), SMALL_WAIT);
    }

    public void clickStop(){
        click(geoLocationPage.getBtnStop());
    }

    public void clickStart(){
        click(geoLocationPage.getBtnStart());
    }

    public String getLatitude(){
        return waitForAttributeToBeDifferentThan(geoLocationPage.getLatitudeData(), "text", "0", SMALL_WAIT).getText();
    }

    public String getLongitude(){
        return waitForAttributeToBeDifferentThan(geoLocationPage.getLongitudeData(), "text", "0", SMALL_WAIT).getText();
    }
}
