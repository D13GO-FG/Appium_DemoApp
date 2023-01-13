package utils;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class HelperClass {
    private static HelperClass helperClass;
    private static AndroidDriver driver;
    private HelperClass() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        //Define where the apk file is located
        File appDir = new File("D:/2022/Java Projects/appiumBootcamp/src/main/resources");
        File app = new File(appDir, "Android-MyDemoApp.apk");
        //Define which is the device we are using to test.
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_3a");
        //Define the automation type for our test
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        //Define the app we are using for our test
        cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        //Server port and URL
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
    }
    public static AndroidDriver getDriver() {
        return driver;
    }
    public static void setUpDriver() throws MalformedURLException {
        if (helperClass==null) {
            helperClass = new HelperClass();
        }
    }
    public static void tearDown() {
        if(driver!=null) {
            driver.quit();
        }
        helperClass = null;
    }
}
