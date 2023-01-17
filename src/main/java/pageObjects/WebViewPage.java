package pageObjects;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class WebViewPage extends BasePage{
    public WebViewPage(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    @AndroidFindBy(xpath = "//android.widget.EditText[@content-desc='URL input field']")
    private WebElement inputURL;

    @AndroidFindBy(xpath = "//android.view.ViewGroup[@content-desc='Go To Site button']")
    private WebElement btnGoToSite;

    //@AndroidFindBy(uiAutomator = "new UiSelector().id('hplogo')")
    @FindBy(how = How.ID, using = "hplogo")
    private WebElement siteText;

    @FindBy(how = How.XPATH, using = "//input[@name='q']")
    private WebElement inputSearch;

    @FindBy(how = How.XPATH, using = "(//div[@role='option'])[1]")
    private WebElement optionSearch;

    @FindBy(how = How.XPATH, using = "//div[normalize-space()='Hello World']")
    private WebElement titleSearch;

    public WebElement getInputURL() {
        return inputURL;
    }

    public WebElement getBtnGoToSite() {
        return btnGoToSite;
    }

    public WebElement getSiteText() {
        return siteText;
    }

    public WebElement getInputSearch() {
        return inputSearch;
    }

    public WebElement getOptionSearch() {
        return optionSearch;
    }

    public WebElement getTitleSearch() {
        return titleSearch;
    }
}
