package pageLocators;

import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class CatalogPageLocators {
    @AndroidFindBy(xpath = "(//android.widget.TextView[@content-desc='store item text'])[1]")
    public WebElement getProduct;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Products']")
    public WebElement getTitleProduct;

    public WebElement getGetProduct() {
        return getProduct;
    }

    public WebElement getGetTitleProduct() {
        return getTitleProduct;
    }
}
