package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import org.testng.Assert;
import steps.LeftMenuSteps;
import steps.ResetAppSteps;

import static tests.BaseTest.getDriver;

public class resetApp {
    LeftMenuSteps leftMenuSteps = new LeftMenuSteps(getDriver());
    ResetAppSteps resetAppSteps = new ResetAppSteps(getDriver());
    @And("The user clicks the reset option")
    public void theUserClicksTheResetOption() {
        leftMenuSteps.clickResetOption();
    }

    @When("The user looks at the reset confirmation pop-up {string}")
    public void theUserLooksAtTheResetConfirmationPopUp(String arg0) {
        Assert.assertEquals(resetAppSteps.isAlertVisible(), arg0, "It's not right pop up.");
    }

    @And("The user clicks the reset app button")
    public void theUserClicksTheResetAppButton() {
        resetAppSteps.clickOK();
    }
}
