package pageLocators;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class ProductPageLocations {
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='Add To Cart button']")
    public WebElement btnAddToCard;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='cart badge']")
    public WebElement btnCard;

    public WebElement getBtnAddToCard() {
        return btnAddToCard;
    }

    public WebElement getBtnCard() {
        return btnCard;
    }
}
