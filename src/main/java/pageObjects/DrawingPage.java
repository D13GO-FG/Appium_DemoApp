package pageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class DrawingPage extends BasePage{
    public DrawingPage(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().text(\"Drawing\")")
    private WebElement titlePage;

    @AndroidFindBy(accessibility = "Save button")
    private WebElement btnSave;

    @AndroidFindBy(accessibility = "Clear button")
    private WebElement btnClear;

    @FindBy(how = How.TAG_NAME, using = "canvas")
    private WebElement canvass;

    @AndroidFindBy(id = "android:id/button1")
    private WebElement popUpSaved;

    public WebElement getTitlePage() {
        return titlePage;
    }

    public WebElement getBtnSave() {
        return btnSave;
    }

    public WebElement getBtnClear() {
        return btnClear;
    }

    public WebElement getCanvass() {
        return canvass;
    }

    public WebElement getPopUpSaved() {
        return popUpSaved;
    }
}
