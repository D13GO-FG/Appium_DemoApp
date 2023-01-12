package tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import io.cucumber.testng.AbstractTestNGCucumberTests;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest extends AbstractTestNGCucumberTests{
    public static AndroidDriver driver;
    public static void setupDriver() throws MalformedURLException {
        //Declaring desired capabilities
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
    public static void quitDriver() throws Exception{
        driver.quit();
    }
}
