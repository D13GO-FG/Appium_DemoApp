package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageActions.CatalogPageActions;
import pageActions.ProductPageActions;
import pageObjects.CatalogPage;
import pageObjects.ProductPage;
import tests.BaseTest;

import java.net.MalformedURLException;
import java.time.Duration;

public class addProductSteps {
    CatalogPageActions catalogPageActions = new CatalogPageActions();
    ProductPageActions productPageActions = new ProductPageActions();
    @When("The user selects an element")
    public void theUserSelectsAnElement() {
        catalogPageActions.clickProduct();
    }
    @And("Clicks on the Add to card button")
    public void clicksOnTheAddToCardButton() {
        productPageActions.clickAddProduct();
    }
    @Then("The element should be added to the user's card")
    public void theElementShouldBeAddedToTheUserSCard() {
        productPageActions.clickBtnCard();
    }
}
