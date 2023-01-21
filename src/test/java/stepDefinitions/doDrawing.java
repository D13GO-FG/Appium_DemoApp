package stepDefinitions;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import steps.DrawingStep;

import static tests.BaseTest.getDriver;

public class doDrawing {
    DrawingStep drawingStep = new DrawingStep(getDriver());
    @Given("The user is on the drawing page")
    public void theUserIsOnTheDrawingPage() {
        getDriver().get("mydemoapprn://drawing");
    }

    @When("The user opens the drawing page")
    public void theUserOpensTheDrawingPage() {
        Assert.assertTrue(drawingStep.getTitle(), "It's not the right view.");
    }

    @And("The user draws a circle on the canvas")
    public void theUserDrawsACircleOnTheCanvas() {
        Assert.assertTrue(drawingStep.doDrawing(), "It wasn't possible to draw in the canvass");
    }

    @And("The user clicks on the Save button")
    public void theUserClicksOnTheButton() {
        drawingStep.saveDraw();
    }

    @Then("The drawing should be saved")
    public void theDrawingShouldBeSaved() {
        drawingStep.acceptPopUp();
    }

    @And("When the user clicks on the Clear button")
    public void whenTheUserClicksOnTheButton() {
        drawingStep.clearDraw();
    }

    @Then("The canvas should be cleared")
    public void theCanvasShouldBeCleared() {
        Assert.assertTrue(drawingStep.isClear(), "Canvass is not clear or context is not found.");
    }
}
