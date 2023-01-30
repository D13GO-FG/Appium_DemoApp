package steps;

import io.appium.java_client.android.AndroidDriver;
import pageObjects.QRCodeScannerPage;

public class QRCodeScannerSteps extends BaseStep{
    QRCodeScannerPage qrCodeScannerPage = new QRCodeScannerPage(getDriver());
    public QRCodeScannerSteps(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    public Boolean isTitleVisible(){
        return doesElementExist(qrCodeScannerPage.getTitlePage(), SMALL_WAIT);
    }

    public Boolean isTextureVisible(){
        return doesElementExist(qrCodeScannerPage.getIsTexture(), SMALL_WAIT);
    }

    public String isUrlBarVisible(){
        return waitForDisplayedElement(qrCodeScannerPage.getIsUrlBar(), SMALL_WAIT).getText();
    }
}
