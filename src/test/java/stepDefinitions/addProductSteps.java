package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import steps.CatalogSteps;
import steps.ProductSteps;
import tests.BaseTest;

public class addProductSteps {
    CatalogSteps catalogSteps = new CatalogSteps(BaseTest.getDriver());
    ProductSteps productSteps = new ProductSteps(BaseTest.getDriver());
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
}
