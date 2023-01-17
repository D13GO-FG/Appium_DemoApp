package steps;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.WebViewPage;

import java.time.Duration;
import java.util.Set;

public class WebViewSteps extends BaseStep{
    WebViewPage webViewPage = new WebViewPage(driver);
    public WebViewSteps(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    public void insertURL(String url){
        WebElement input = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(webViewPage.getInputURL()));
        input.sendKeys(url);
    }

    public void clickGoToSite(){
        WebElement btn = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(webViewPage.getBtnGoToSite()));
        btn.click();
    }

    public Boolean getTextSite(){
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        //driver.context("WEBVIEW_com.saucelabs.mydemoapp.rn");
        WebElement text = new WebDriverWait(driver, Duration.ofSeconds(10)).until(ExpectedConditions.visibilityOf(webViewPage.getSiteText()));
        return text.isDisplayed();
    }

    public void inputSearch(String searchText){
        WebElement input = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(webViewPage.getInputSearch()));
        input.click();
        input.sendKeys(searchText);
    }

    public void clickSearch(){
        WebElement btn = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(webViewPage.getOptionSearch()));
        btn.click();
    }

    public Boolean isTitleSearch(){
        WebElement btn = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(webViewPage.getTitleSearch()));
        return btn.isDisplayed();
    }
}
