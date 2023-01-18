package pageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class GeoLocationPage extends BasePage{
    public GeoLocationPage(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Geo Location\")")
    private WebElement titlePage;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").text(\"Start Observing\")")
    private WebElement btnStart;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").text(\"Stop Observing\")")
    private WebElement btnStop;

    @AndroidFindBy(accessibility = "latitude data")
    private WebElement latitudeData;

    @AndroidFindBy(accessibility = "longitude data")
    private WebElement longitudeData;

    public WebElement getTitlePage() {
        return titlePage;
    }

    public WebElement getBtnStart() {
        return btnStart;
    }

    public WebElement getBtnStop() {
        return btnStop;
    }

    public WebElement getLatitudeData() {
        return latitudeData;
    }

    public WebElement getLongitudeData() {
        return longitudeData;
    }
}
