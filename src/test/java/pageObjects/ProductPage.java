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

    public WebElement getBtnAddToCard() {
        return btnAddToCard;
    }

    public void setBtnAddToCard(WebElement btnAddToCard) {
        this.btnAddToCard = btnAddToCard;
    }

    public WebElement getBtnCard() {
        return btnCard;
    }

    public void setBtnCard(WebElement btnCard) {
        this.btnCard = btnCard;
    }
}
