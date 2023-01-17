package pageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class CatalogPage extends BasePage{
    public CatalogPage(AndroidDriver driver) {
        super(driver);
    }
    @AndroidFindBy(xpath = "(//android.widget.TextView[@content-desc='store item text'])[1]")
    private WebElement selectProduct;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Products']")
    private WebElement titleProduct;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='open menu']")
    private WebElement burgerBtn;

    public WebElement getSelectProduct() {
        return selectProduct;
    }

    public WebElement getTitleProduct() {
        return titleProduct;
    }

    public WebElement getBurgerBtn() {
        return burgerBtn;
    }
}
