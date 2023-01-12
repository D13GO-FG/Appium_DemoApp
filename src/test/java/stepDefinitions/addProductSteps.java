package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.CatalogPage;
import pageObjects.ProductPage;
import tests.BaseTest;

import java.net.MalformedURLException;
import java.time.Duration;

public class addProductSteps extends BaseTest {
    CatalogPage catalogPage;
    ProductPage productPage;
    @Before
    public void beforeTest() throws MalformedURLException {
        setupDriver();
        catalogPage = new CatalogPage(driver);
        productPage = new ProductPage(driver);
    }
    @When("The user selects an element")
    public void theUserSelectsAnElement() {
        WebElement selectProduct = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(catalogPage.getGetProduct()));
        selectProduct.click();
    }
    @And("Clicks on the Add to card button")
    public void clicksOnTheAddToCardButton() {
        WebElement btnAddClicked = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(productPage.getBtnAddToCard()));
        btnAddClicked.click();
    }
    @Then("The element should be added to the user's card")
    public void theElementShouldBeAddedToTheUserSCard() {
        WebElement btnCardClicked = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(productPage.getBtnCard()));
        btnCardClicked.click();
    }
    @After
    public void afterTest() throws Exception {
        quitDriver();
    }
}
