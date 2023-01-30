package steps;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import pageObjects.DrawingPage;

public class DrawingStep extends BaseStep{
    DrawingPage drawingPage = new DrawingPage(getDriver());
    public DrawingStep(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    public Boolean doDrawing(){
        if (getContexts().isPresent()) {
            getDriver().context(getContexts().get());
            Actions actions = new Actions(getDriver());
            WebElement canvass = scrollFastToElement(drawingPage.getCanvass());
            actions.moveToElement(canvass).clickAndHold();
            int numPoints = 10;
            int radius = 30;
            for (int i = 0; i <= numPoints ; i++) {
                double angle = Math.toRadians(360 * i / numPoints);
                double x = Math.sin(angle) * radius;
                double y = Math.cos(angle) * radius;
                actions.moveByOffset((int) x, (int) y);
            }
            actions.release(canvass).build().perform();
            getDriver().context("NATIVE_APP");
            return true;
        }else {
            System.out.println("WebView context not found");
            return false;
        }
    }

    public boolean getTitle(){
        return doesElementExist(drawingPage.getTitlePage(), SMALL_WAIT);
    }

    public void saveDraw(){
        click(drawingPage.getBtnSave());
    }

    public void acceptPopUp(){
        click(drawingPage.getPopUpSaved());
    }

    public void clearDraw(){
        click(drawingPage.getBtnClear());
    }

    public Boolean isClear(){
        if (getContexts().isPresent()){
            getDriver().context(getContexts().get());
            WebElement canvass = scrollFastToElement(drawingPage.getCanvass());
            // Check the number of child elements inside the canvas element. If there are no child elements inside the canvas, it is likely that the canvas is empty.
            return canvass.findElements(By.xpath("./*")).isEmpty();
        }else {
            System.out.println("WebView context not found");
            return false;
        }
    }
}
