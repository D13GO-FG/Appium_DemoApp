package pageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class QRCodeScannerPage extends BasePage{
    public QRCodeScannerPage(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"QR Code Scanner\")")
    private WebElement titlePage;

    @AndroidFindBy(id = "com.saucelabs.mydemoapp.rn:id/texture_view")
    private WebElement isTexture;

    @AndroidFindBy(id = "com.android.chrome:id/url_bar")
    private WebElement isUrlBar;

    public WebElement getTitlePage() {
        return titlePage;
    }

    public WebElement getIsTexture() {
        return isTexture;
    }

    public WebElement getIsUrlBar() {
        return isUrlBar;
    }
}
