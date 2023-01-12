package pageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class CatalogPage extends BasePage {
    public CatalogPage(AndroidDriver driver) {
        super(driver);
    }
    @AndroidFindBy(xpath = "(//android.widget.TextView[@content-desc='store item text'])[1]")
    private WebElement getProduct;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Products']")
    private WebElement getTitleProduct;

    public WebElement getGetProduct() {
        return getProduct;
    }

    public void setGetProduct(WebElement getProduct) {
        this.getProduct = getProduct;
    }

    public WebElement getGetTitleProduct() {
        return getTitleProduct;
    }

    public void setGetTitleProduct(WebElement getTitleProduct) {
        this.getTitleProduct = getTitleProduct;
    }
}
