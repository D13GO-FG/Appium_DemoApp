package steps;

import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.*;
import org.openqa.selenium.interactions.PointerInput;
import org.openqa.selenium.interactions.Sequence;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import static org.openqa.selenium.support.ui.ExpectedConditions.*;

import java.time.Duration;
import java.util.Collections;
import java.util.Optional;
import java.util.Set;

public class BaseStep {
    private AndroidDriver driver;

    public AndroidDriver getDriver(){
        return this.driver;
    }

    //public static final int MIN_WAIT = 2;
    public static final int SMALL_WAIT = 10;
    //public static final int MED_WAIT = 30;
    //public static final int LONG_WAIT = 60;
    public static final int MAX_WAIT = 120;
    public static final int MAX_SCROLL = 100;

    public BaseStep(AndroidDriver androidDriver){
        this.driver = androidDriver;
    }

    protected <K>FluentWait<K> waitOn(K object, int timeOutSeconds){
        return new FluentWait<>(object).ignoring(NoSuchContextException.class)//Maybe the same that the next one.
                .ignoring(NoSuchElementException.class)
                .ignoring(StaleElementReferenceException.class)
                .ignoring(Exception.class)
                .withTimeout(Duration.ofSeconds(timeOutSeconds));
    }

    public FluentWait<AndroidDriver> getWait(){
        return waitOn(driver, MAX_WAIT);
    }

    protected void click(WebElement element){
        getWait().until(elementToBeClickable(element)).click();
    }

    protected WebElement waitForDisplayedElement(WebElement element, int seconds){
        return waitOn(driver, seconds).until(visibilityOf(element));
    }

    protected WebElement waitForAttributeToBeDifferentThan(WebElement element, String attribute, String value, int seconds){
        WebElement mobileElement = waitForDisplayedElement(element, seconds);
        boolean status = getWait().until(ExpectedConditions.not(ExpectedConditions.attributeToBe(mobileElement,attribute,value)));
        if (status) {
            return mobileElement;
        }else {
            return null;
        }
    }

    protected boolean doesElementExist(WebElement element, int timeout){
        try {
            waitOn(driver, timeout).until(visibilityOf(element));
        }catch (Exception toe){
            return false;
        }
        return true;
    }

    private void touchAction(int width, int start, int end){
        PointerInput touchInput = new PointerInput(PointerInput.Kind.TOUCH, "finger");
        Sequence action = new Sequence(touchInput, 0);
        action.addAction(touchInput.createPointerMove(Duration.ZERO, PointerInput.Origin.viewport(), width, start));
        action.addAction(touchInput.createPointerDown(PointerInput.MouseButton.LEFT.asArg()));
        action.addAction(touchInput.createPointerMove(Duration.ofMillis(1000), PointerInput.Origin.viewport(), width, end));
        action.addAction(touchInput.createPointerUp(PointerInput.MouseButton.LEFT.asArg()));
        //Arrays.asList(action);
        driver.perform(Collections.singletonList(action));
    }

    public void fastScrollDownTouchAction(){
        Dimension size = driver.manage().window().getSize();
        int width = size.getWidth() / 2;
        int start = (int) (size.getHeight() * 0.8);
        int end = (int) (size.getHeight() * 0.2);
        touchAction(width, start, end);
    }

    public WebElement scrollFastToElement(WebElement element){
        for (int scroll = 0; scroll < MAX_SCROLL; scroll++) {
            try {
                if (element.isDisplayed()) {
                    return element;
                }else {
                    fastScrollDownTouchAction();
                }
            }catch (Exception e){
                System.out.println("Fail find element");
                fastScrollDownTouchAction();
            }
        }
        return null;
    }

    protected Optional<String> getContexts () {
        Set<String> contextNames = driver.getContextHandles();
        //contextNames.forEach(System.out::println);
        Optional<String> webViewContext = contextNames.stream().filter(name -> name.startsWith("WEBVIEW")).findFirst();
        return webViewContext;
    }

    public void type(WebElement element, String text){
        getWait().until(elementToBeClickable(element));
        element.clear();
        element.sendKeys(text);
    }
}
