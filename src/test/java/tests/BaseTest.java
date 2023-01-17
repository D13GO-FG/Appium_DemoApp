package tests;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.Browser;
import org.openqa.selenium.remote.DesiredCapabilities;
import sun.plugin2.util.BrowserType;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class BaseTest{
    private static BaseTest baseTest;
    private static AndroidDriver driver;
    private BaseTest() throws MalformedURLException {
        DesiredCapabilities cap = new DesiredCapabilities();
        //Define where the apk file is located
        File appDir = new File("D:/2022/Java Projects/appiumBootcamp/src/main/resources");
        File app = new File(appDir, "Android-MyDemoApp.apk");
        //Define which is the device we are using to test.
        cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Pixel_3a");
        //Define the automation type for our test
        cap.setCapability(MobileCapabilityType.AUTOMATION_NAME, "UiAutomator2");
        //cap.setCapability(MobileCapabilityType.BROWSER_NAME, "Chrome");
        //cap.setCapability("chromedriverExecutable", "D:\\2022\\Selemiun Driver and jars\\chromedriver_win32\\chromedriver.exe");
        //Define the app we are using for our test
        cap.setCapability(MobileCapabilityType.APP, app.getAbsolutePath());
        //Server port and URL
        driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), cap);
    }
    public static AndroidDriver getDriver() {
        return driver;
    }
    public static void setUpDriver() throws MalformedURLException {
        if (baseTest==null) {
            baseTest = new BaseTest();
        }
    }
    public static void tearDown() {
        if(driver!=null) {
            driver.quit();
        }
        baseTest = null;
    }
}
