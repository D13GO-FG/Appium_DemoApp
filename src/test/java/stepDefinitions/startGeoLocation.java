package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.html5.Location;
import org.testng.Assert;
import steps.GeoLocationSteps;

import java.time.Duration;

import static tests.BaseTest.getDriver;

public class startGeoLocation {
    GeoLocationSteps geoLocationSteps = new GeoLocationSteps(getDriver());
    @Given("The user opens the geolocation page")
    public void theUserOpensTheGeolocationPage() {
        getDriver().get("mydemoapprn://geo-locations");
        Assert.assertEquals(geoLocationSteps.getTitlePage(), true, "Page isn't Geo Location");
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
    }

    @Then("The latitude and longitude should be different from {string}")
    public void theLatitudeAndLongitudeShouldBeDifferentFrom(String arg0) {
        Assert.assertNotEquals(geoLocationSteps.getLongitude(), arg0, "Longitude is equal to 0");
        Assert.assertNotEquals(geoLocationSteps.getLatitude(), arg0, "Latitude is equal to 0");
    }

    @When("The user clicks on the Stop Observing button")
    public void theUserClicksOnTheButtonStop() {
        geoLocationSteps.clickStop();
    }

    @And("The user clicks on the Start Observing button")
    public void theUserClicksOnTheButtonStart() {
        geoLocationSteps.clickStart();
        getDriver().setLocation(new Location(49, 123, 10));
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
    }

    @Then("The geolocation should be updated and displayed on the page")
    public void theGeolocationShouldBeUpdatedAndDisplayedOnThePage() {
        Assert.assertEquals(geoLocationSteps.getLongitude(), "123", "Wrong Longitude");
        Assert.assertEquals(geoLocationSteps.getLatitude(), "49", "Wrong Latitude");
    }
}
