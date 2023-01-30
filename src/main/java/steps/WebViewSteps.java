package steps;

import io.appium.java_client.android.AndroidDriver;
import pageObjects.WebViewPage;

public class WebViewSteps extends BaseStep{
    WebViewPage webViewPage = new WebViewPage(getDriver());
    public WebViewSteps(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    public void insertURL(String url){
        type(webViewPage.getInputURL(), url);
    }

    public void clickGoToSite(){
        click(webViewPage.getBtnGoToSite());
    }

    public Boolean getTextSite(){
        //driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
        //driver.context("WEBVIEW_com.saucelabs.mydemoapp.rn");
        return doesElementExist(webViewPage.getSiteText(), SMALL_WAIT);
    }

    public void inputSearch(String searchText){
        click(webViewPage.getInputSearch());
        type(webViewPage.getInputSearch(), searchText);
    }

    public void clickSearch(){
        click(webViewPage.getOptionSearch());
    }

    public Boolean isTitleSearch(){
        return doesElementExist(webViewPage.getTitleSearch(), SMALL_WAIT);
    }
}
