package steps;

import io.appium.java_client.android.AndroidDriver;
import pageObjects.CheckoutPage;

public class CheckoutSteps extends BaseStep{
    CheckoutPage checkoutPage =  new CheckoutPage(getDriver());
    public CheckoutSteps(AndroidDriver androidDriver) {
        super(androidDriver);
    }

    public boolean isTitleVisible(){
        return doesElementExist(checkoutPage.getTitlePage(), SMALL_WAIT);
    }

    public void typeFullName(String name){
        type(checkoutPage.getInputFullName(), name);
    }

    public void typeAddress(String address){
        type(checkoutPage.getInputAddress(), address);
    }

    public void typeAddress2(String address){
        type(checkoutPage.getInputAddress2(), address);
    }

    public void typeCity(String city){
        type(checkoutPage.getInputCity(), city);
    }

    public void typeState(String state){
        type(checkoutPage.getInputState(), state);
    }

    public void typeZipCode(String code){
        type(checkoutPage.getInputZipCode(), code);
    }

    public void typeCountry(String country){
        type(checkoutPage.getInputCountry(), country);
    }

    public void clickPayment(){
        click(checkoutPage.getBtnPayment());
    }

    public void typeCardNumber(String card){
        type(checkoutPage.getInputCardNumber(), card);
    }

    public void typeExpDate(String date){
        type(checkoutPage.getInputExpDate(), date);
    }

    public void typeSecurityCode(String code){
        type(checkoutPage.getInputSecurityCode(), code);
    }

    public void clickReviewOrder(){
        click(checkoutPage.getBtnReviewOrder());
    }

    public void clickPlaceOrder(){
        click(checkoutPage.getBtnPlaceOrder());
    }

    public boolean isTitleCompleteVisible(){
        return doesElementExist(checkoutPage.getTitleComplete(), SMALL_WAIT);
    }

}
