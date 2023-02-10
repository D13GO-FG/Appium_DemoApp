package pageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class ProductPage extends BasePage{
    public ProductPage(AndroidDriver driver) {
        super(driver);
    }
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='Add To Cart button']")
    private WebElement btnAddToCard;
    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='cart badge']")
    private WebElement btnCard;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"My Cart\")")
    private WebElement titlePage;

    @AndroidFindBy(accessibility = "Proceed To Checkout button")
    private WebElement btnProceed;

    public WebElement getBtnAddToCard() {
        return btnAddToCard;
    }

    public WebElement getBtnCard() {
        return btnCard;
    }

    public WebElement getTitlePage() {
        return titlePage;
    }

    public WebElement getBtnProceed() {
        return btnProceed;
    }
}
