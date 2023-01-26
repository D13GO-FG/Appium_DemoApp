package steps;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.QRCodeScannerPage;

import java.time.Duration;

public class QRCodeScannerSteps extends BaseStep{
    QRCodeScannerPage qrCodeScannerPage = new QRCodeScannerPage(driver);
    public QRCodeScannerSteps(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    public Boolean isTitleVisible(){
        WebElement title = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(qrCodeScannerPage.getTitlePage()));
        return title.isDisplayed();
    }

    public Boolean isTextureVisible(){
        WebElement texture = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(qrCodeScannerPage.getIsTexture()));
        return texture.isDisplayed();
    }

    public String isUrlBarVisible(){
        WebElement urlBar = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(qrCodeScannerPage.getIsUrlBar()));
        return urlBar.getText();
    }
}
