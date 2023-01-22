package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import steps.CheckoutSteps;
import steps.LogInSteps;

import static tests.BaseTest.getDriver;

public class logInApp {
    LogInSteps logInSteps = new LogInSteps(getDriver());
    CheckoutSteps checkoutSteps = new CheckoutSteps(getDriver());
    @Given("The user is on the login page")
    public void theUserIsOnTheLoginPage() {
        getDriver().get("mydemoapprn://login");
    }

    @When("The user input an username {string}")
    public void theUserInputAnUsernameUsername(String username) {
        logInSteps.typeUsername(username);
    }

    @And("The user input an password {string}")
    public void theUserInputAnCorrectPasswordPassword(String password) {
        logInSteps.typePassword(password);
    }

    @When("The user click the login button")
    public void theUserClickTheLoginButton() {
        logInSteps.clickLogin();
    }

    @Then("The user should be directed to the catalog page")
    public void theUserShouldBeDirectedToTheCatalogPage() {
        Assert.assertTrue(checkoutSteps.isTitleVisible(), "There's not title visible.");
    }

    @Then("I should see an error message {string}")
    public void iShouldSeeAnErrorMessage(String errorMsg) {
        Assert.assertEquals(logInSteps.msgErrorText(), errorMsg, "Message error is different as a result It's wrong");
    }
}
