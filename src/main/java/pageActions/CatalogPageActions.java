package pageActions;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageLocators.CatalogPageLocators;
import utils.HelperClass;

import java.time.Duration;

public class CatalogPageActions {
    CatalogPageLocators catalogPageLocators;
    public CatalogPageActions(){
        catalogPageLocators = new CatalogPageLocators();
        PageFactory.initElements(new AppiumFieldDecorator(HelperClass.getDriver()),catalogPageLocators);
    }

    public void clickProduct(){
        WebElement selectProduct = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(catalogPageLocators.getProduct));
        selectProduct.click();
    }
}
