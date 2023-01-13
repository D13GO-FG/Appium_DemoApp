package steps;

import io.appium.java_client.android.AndroidDriver;

public class BaseStep {
    AndroidDriver driver;
    public BaseStep(AndroidDriver androidDriver){
        this.driver = androidDriver;
    }
}
