package pageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;

public class CheckoutPage extends BasePage{
    public CheckoutPage(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Checkout\")")
    private WebElement titlePage;

    @AndroidFindBy(accessibility = "Full Name* input field")
    private WebElement inputFullName;

    @AndroidFindBy(accessibility = "Address Line 1* input field")
    private WebElement inputAddress;

    @AndroidFindBy(accessibility = "Address Line 2 input field")
    private WebElement inputAddress2;

    @AndroidFindBy(accessibility = "City* input field")
    private WebElement inputCity;

    @AndroidFindBy(accessibility = "State/Region input field")
    private WebElement inputState;

    @AndroidFindBy(accessibility = "Zip Code* input field")
    private WebElement inputZipCode;

    @AndroidFindBy(accessibility = "Country* input field")
    private WebElement inputCountry;

    @AndroidFindBy(accessibility = "To Payment button")
    private WebElement btnPayment;

    @AndroidFindBy(accessibility = "Card Number* input field")
    private WebElement inputCardNumber;

    @AndroidFindBy(accessibility = "Expiration Date* input field")
    private WebElement inputExpDate;

    @AndroidFindBy(accessibility = "Security Code* input field")
    private WebElement inputSecurityCode;

    @AndroidFindBy(accessibility = "Review Order button")
    private WebElement btnReviewOrder;

    @AndroidFindBy(accessibility = "Place Order button")
    private WebElement btnPlaceOrder;

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Checkout Complete\")")
    private WebElement titleComplete;

    public WebElement getTitlePage() {
        return titlePage;
    }

    public WebElement getInputFullName() {
        return inputFullName;
    }

    public WebElement getInputAddress() {
        return inputAddress;
    }

    public WebElement getInputAddress2() {
        return inputAddress2;
    }

    public WebElement getInputCity() {
        return inputCity;
    }

    public WebElement getInputState() {
        return inputState;
    }

    public WebElement getInputZipCode() {
        return inputZipCode;
    }

    public WebElement getInputCountry() {
        return inputCountry;
    }

    public WebElement getBtnPayment() {
        return btnPayment;
    }

    public WebElement getInputCardNumber() {
        return inputCardNumber;
    }

    public WebElement getInputExpDate() {
        return inputExpDate;
    }

    public WebElement getInputSecurityCode() {
        return inputSecurityCode;
    }

    public WebElement getBtnReviewOrder() {
        return btnReviewOrder;
    }

    public WebElement getBtnPlaceOrder() {
        return btnPlaceOrder;
    }

    public WebElement getTitleComplete() {
        return titleComplete;
    }
}
