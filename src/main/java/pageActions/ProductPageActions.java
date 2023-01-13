package pageActions;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageLocators.ProductPageLocations;
import utils.HelperClass;

import java.time.Duration;

public class ProductPageActions {
    ProductPageLocations productPageLocations;

    public ProductPageActions() {
        productPageLocations = new ProductPageLocations();
        PageFactory.initElements(new AppiumFieldDecorator(HelperClass.getDriver()),productPageLocations);
    }
    public void clickAddProduct(){
        WebElement btnAdd = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(productPageLocations.btnAddToCard));
        btnAdd.click();
    }
    public void clickBtnCard(){
        WebElement btnCard = new WebDriverWait(HelperClass.getDriver(), Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(productPageLocations.btnCard));
        btnCard.click();
    }
}
