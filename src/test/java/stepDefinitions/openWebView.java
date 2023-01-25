package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import steps.CatalogSteps;
import steps.LeftMenuSteps;
import steps.WebViewSteps;
import tests.BaseTest;

public class openWebView {
    CatalogSteps catalogSteps = new CatalogSteps(BaseTest.getDriver());
    LeftMenuSteps leftMenuSteps = new LeftMenuSteps(BaseTest.getDriver());
    WebViewSteps webViewSteps = new WebViewSteps(BaseTest.getDriver());
    @Given("The user is on the home screen")
    public void theUserIsOnTheHomeScreen() {
        Assert.assertTrue(catalogSteps.getProductTitle(), "There's not title visible.");
    }

    @When("The user clicks on the burger button")
    public void theUserClicksOnTheBurgerButton() {
        catalogSteps.clickBurgerBtn();
    }

    @And("Clicks on the WebView option")
    public void clicksOnTheWebViewOption() {
        leftMenuSteps.clickWebViewOption();
    }

    @And("Inserts the URL {string} into the input field")
    public void insertsTheURLIntoTheInputField(String arg0) {
        webViewSteps.insertURL(arg0);
    }

    @And("Clicks on the Go to site button")
    public void clicksOnTheGoToSiteButton() {
        webViewSteps.clickGoToSite();
    }

    @Then("The website should be displayed in the WebView")
    public void theWebsiteShouldBeDisplayedInTheWebView() {
        BaseTest.getDriver().context("WEBVIEW_com.saucelabs.mydemoapp.rn");
        Boolean status = webViewSteps.getTextSite();
        Assert.assertEquals(status, true, "Site is not present");
    }

    @And("The user inserts {string} in the google page")
    public void theUserInsertsInTheGooglePage(String arg0) {
        webViewSteps.inputSearch(arg0);
    }

    @And("Clicks on the search button")
    public void clicksOnTheSearchButton() {
        webViewSteps.clickSearch();
    }

    @Then("The search results should be displayed")
    public void theSearchResultsShouldBeDisplayed() {
        Boolean status = webViewSteps.isTitleSearch();
        Assert.assertTrue(status, "Title is not present");
        BaseTest.getDriver().context("NATIVE_APP");
    }
}
