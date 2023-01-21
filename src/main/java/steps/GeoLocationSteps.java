package steps;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.GeoLocationPage;

import java.time.Duration;

public class GeoLocationSteps extends BaseStep{
    GeoLocationPage geoLocationPage = new GeoLocationPage(driver);
    public GeoLocationSteps(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    public boolean getTitlePage(){
        WebElement title = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(geoLocationPage.getTitlePage()));
        return title.isDisplayed();
    }

    public void clickStop(){
        WebElement btn = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(geoLocationPage.getBtnStop()));
        btn.click();
    }

    public void clickStart(){
        WebElement btn = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(geoLocationPage.getBtnStart()));
        btn.click();
    }

    public String getLatitude(){
        WebElement label = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(geoLocationPage.getLatitudeData()));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.not(ExpectedConditions.attributeToBe(label,"text","0")));
        return label.getText();
    }

    public String getLongitude(){
        WebElement label = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(geoLocationPage.getLongitudeData()));
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        wait.until(ExpectedConditions.not(ExpectedConditions.attributeToBe(label,"text","0")));
        return label.getText();
    }
}
