package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import steps.CatalogSteps;
import steps.CheckoutSteps;
import steps.ProductSteps;
import tests.BaseTest;

public class addProductSteps {
    CatalogSteps catalogSteps = new CatalogSteps(BaseTest.getDriver());
    ProductSteps productSteps = new ProductSteps(BaseTest.getDriver());
    CheckoutSteps checkoutSteps = new CheckoutSteps(BaseTest.getDriver());
    @When("The user selects an element")
    public void theUserSelectsAnElement() {
        catalogSteps.clickProduct();
    }
    @And("Clicks on the Add to card button")
    public void clicksOnTheAddToCardButton() {
        productSteps.clickAddProduct();
    }
    @Then("The element should be added to the user's card")
    public void theElementShouldBeAddedToTheUserSCard() {
        productSteps.clickBtnCard();
    }

    @And("The user clicks Proceed To Checkout button")
    public void theUserClicksProceedToCheckoutButton() {
        Assert.assertTrue(productSteps.getTitle(), "It's not right screen");
        productSteps.clickBtnProceed();
    }

    @Then("The user types Full Name {string}")
    public void theUserTypesFullName(String arg0) {
        checkoutSteps.typeFullName(arg0);
    }

    @And("The user types Address one {string}")
    public void theUserTypesAddressOne(String arg0) {
        checkoutSteps.typeAddress(arg0);
    }

    @And("The user types Address two {string}")
    public void theUserTypesAddressTwo(String arg0) {
        checkoutSteps.typeAddress2(arg0);
    }

    @And("The user types City {string}")
    public void theUserTypesCity(String arg0) {
        checkoutSteps.typeCity(arg0);
    }

    @And("The user types State {string}")
    public void theUserTypesState(String arg0) {
        checkoutSteps.typeState(arg0);
    }

    @And("The user types Zip Code {string}")
    public void theUserTypesZipCode(String arg0) {
        checkoutSteps.typeZipCode(arg0);
    }

    @And("The user types Country {string}")
    public void theUserTypesCountry(String arg0) {
        checkoutSteps.typeCountry(arg0);
    }

    @Then("The user clicks To Payment")
    public void theUserClicksToPayment() {
        checkoutSteps.clickPayment();
    }

    @And("The user types Card Number {string}")
    public void theUserTypesCardNumber(String arg0) {
        checkoutSteps.typeCardNumber(arg0);
    }

    @And("The user types Expiration Date {string}")
    public void theUserTypesExpirationDate(String arg0) {
        checkoutSteps.typeExpDate(arg0);
    }

    @And("The user types Security Code {string}")
    public void theUserTypesSecurityCode(String arg0) {
        checkoutSteps.typeSecurityCode(arg0);
    }

    @Then("The user clicks Review Order button")
    public void theUserClicksReviewOrderButton() {
        checkoutSteps.clickReviewOrder();
    }

    @And("The user clicks Place Order button")
    public void theUserClicksPlaceOrderButton() {
        checkoutSteps.clickPlaceOrder();
    }

    @Then("The user sees Checkout Complete")
    public void theUserSeesCheckoutComplete() {
        Assert.assertTrue(checkoutSteps.isTitleCompleteVisible(), "It's not right screen");
    }
}
