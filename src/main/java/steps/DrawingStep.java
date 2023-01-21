package steps;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pageObjects.DrawingPage;

import java.time.Duration;
import java.util.Optional;
import java.util.Set;

public class DrawingStep extends BaseStep{
    DrawingPage drawingPage = new DrawingPage(driver);
    public DrawingStep(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    private Optional<String> getContexts () {
        Set<String> contextNames = driver.getContextHandles();
        //contextNames.forEach(System.out::println);
        Optional<String> webViewContext = contextNames.stream().filter(name -> name.startsWith("WEBVIEW")).findFirst();
        return webViewContext;
    }
    public Boolean doDrawing(){
        if (getContexts().isPresent()) {
            driver.context(getContexts().get());
            Actions actions = new Actions(driver);
            WebElement canvass = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(drawingPage.getCanvass()));
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
            driver.context("NATIVE_APP");
            return true;
        }else {
            System.out.println("WebView context not found");
            return false;
        }
    }

    public boolean getTitle(){
        WebElement title = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(drawingPage.getTitlePage()));
        return title.isDisplayed();
    }

    public void saveDraw(){
        WebElement save = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(drawingPage.getBtnSave()));
        save.click();
    }

    public void acceptPopUp(){
        WebElement popUp = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(drawingPage.getPopUpSaved()));
        popUp.click();
    }

    public void clearDraw(){
        WebElement clear = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(drawingPage.getBtnClear()));
        clear.click();
    }

    public Boolean isClear(){
        if (getContexts().isPresent()){
            driver.context(getContexts().get());
            WebElement canvass = new WebDriverWait(driver, Duration.ofSeconds(5)).until(ExpectedConditions.visibilityOf(drawingPage.getCanvass()));
            // Check the number of child elements inside the canvas element. If there are no child elements inside the canvas, it is likely that the canvas is empty.
            return canvass.findElements(By.xpath("./*")).isEmpty();
        }else {
            System.out.println("WebView context not found");
            return false;
        }
    }
}
