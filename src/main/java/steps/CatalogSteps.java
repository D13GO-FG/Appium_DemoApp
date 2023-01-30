package steps;

import io.appium.java_client.android.AndroidDriver;

import pageObjects.CatalogPage;

public class CatalogSteps extends BaseStep {
    CatalogPage catalogPage = new CatalogPage(driver);
    public CatalogSteps(AndroidDriver driver){
        super(driver);
    }

    public void clickProduct(){
        click(catalogPage.getSelectProduct());
    }

    public Boolean getProductTitle(){
        return doesElementExist(catalogPage.getTitleProduct(), SMALL_WAIT);
    }

    public void clickBurgerBtn(){
        click(catalogPage.getBurgerBtn());
    }
}
