package steps;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.ProductPage;

import java.time.Duration;

public class ProductSteps extends BaseStep{
    ProductPage productPage = new ProductPage(driver);

    public ProductSteps(AndroidDriver driver) {
        super(driver);
    }
    public void clickAddProduct(){
        WebElement btnAdd = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(productPage.getBtnAddToCard()));
        btnAdd.click();
    }
    public void clickBtnCard(){
        WebElement btnCard = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(productPage.getBtnCard()));
        btnCard.click();
    }
}
