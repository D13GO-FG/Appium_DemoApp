package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import steps.CatalogSteps;
import steps.LeftMenuSteps;
import steps.LogInSteps;
import steps.LogOutSteps;

import static tests.BaseTest.getDriver;

public class logOutApp {
    CatalogSteps catalogSteps = new CatalogSteps(getDriver());
    LeftMenuSteps leftMenuSteps = new LeftMenuSteps(getDriver());
    LogOutSteps logOutSteps = new LogOutSteps(getDriver());
    LogInSteps logInSteps = new LogInSteps(getDriver());

    @Given("The user is in Catalog")
    public void theUserIsInCatalog() {
        catalogSteps.getProductTitle();
    }

    @When("The user open the left menu of options")
    public void theUserOpenTheLeftMenuOfOptions() {
        catalogSteps.clickBurgerBtn();
    }

    @And("The user clicks the logout option")
    public void theUserClicksTheLogoutOption() {
        leftMenuSteps.clickLogOutOption();
    }

    @When("The user looks at the logout confirmation pop-up {string}")
    public void theUserLooksAtTheLogoutConfirmationPopUp(String arg0) {
        Assert.assertEquals(logOutSteps.isAlertVisible(), arg0, "It's not right pop up.");
    }

    @And("The user clicks the logout button")
    public void theUserClicksTheLogoutButton() {
        logOutSteps.clickOK();
    }

    @And("The user clicks OK on the confirmation pop-up {string}")
    public void theUserClicksOKOnTheConfirmationPopUp(String arg0) {
        Assert.assertEquals(logOutSteps.isAlertVisible(), arg0, "It's not right pop up.");
        logOutSteps.clickOK();//In this case I can use the same locator to Accept the second pop up.
    }

    @Then("The user should be logged out")
    public void theUserShouldBeLoggedOut() {
        Assert.assertTrue(logInSteps.isLoginScreen(), "It's not login screen visible.");
    }

    @And("The user clicks the cancel button")
    public void theUserClicksTheCancelButton() {
        logOutSteps.clickCancel();
    }

    @Then("The user returns to left menu")
    public void theUserReturnsToLeftMenu() {
        Assert.assertTrue(leftMenuSteps.isLogOutVisible(),"It's not visible");
    }
}
