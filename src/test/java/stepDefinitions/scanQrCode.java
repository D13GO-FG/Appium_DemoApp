package stepDefinitions;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import steps.QRCodeScannerSteps;

import java.time.Duration;

import static tests.BaseTest.getDriver;

public class scanQrCode {
    QRCodeScannerSteps qrCodeScannerSteps = new QRCodeScannerSteps(getDriver());
    @Given("The user is in Qr Code Scanner view")
    public void theUserIsInQrCodeScannerView() {
        getDriver().get("mydemoapprn://qr-code-scanner");
        Assert.assertTrue(qrCodeScannerSteps.isTitleVisible(), "It's not page Qr Code Scanner");
    }

    @When("The camera is open and look at QR")
    public void theCameraIsOpenAndLookAtQR() {
        Assert.assertTrue(qrCodeScannerSteps.isTextureVisible(), "It's not square in camera");
        getDriver().manage().timeouts().implicitlyWait(Duration.ofSeconds(50));
    }

    @Then("The user sees browser with url {string}")
    public void theUserSeesBrowserWithUrl(String arg0) {
        Assert.assertEquals(qrCodeScannerSteps.isUrlBarVisible(), arg0, "It's not right URL opened");
    }
}
