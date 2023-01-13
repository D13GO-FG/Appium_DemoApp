package steps;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import pageObjects.CatalogPage;

import java.time.Duration;

public class CatalogSteps extends BaseStep {
    CatalogPage catalogPage = new CatalogPage(driver);
    public CatalogSteps(AndroidDriver driver){
        super(driver);
        //this.catalogPage = new CatalogPage(driver);
        //PageFactory.initElements(new AppiumFieldDecorator(driver),catalogPage);
    }

    public void clickProduct(){
        WebElement clickProduct = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(catalogPage.getSelectProduct()));
        clickProduct.click();
    }
}