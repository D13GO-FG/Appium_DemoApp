package org.example;

import io.appium.java_client.android.AndroidDriver;
//import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.By;
import org.openqa.selenium.remote.DesiredCapabilities;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {
    public static void main(String[] args) throws MalformedURLException, InterruptedException {
        AndroidDriver driver;
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
        //Click
        Thread.sleep(2000);
        driver.findElement(By.xpath("//android.widget.TextView[@text='Products']")).isDisplayed();
        driver.findElement(By.xpath("(//android.widget.TextView[@content-desc='store item text'])[1]")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc='Add To Cart button']")).click();
        Thread.sleep(1000);
        driver.findElement(By.xpath("//android.view.ViewGroup[@content-desc='cart badge']")).click();
        //driver.findElement(By.xpath("//android.widget.TextView[@text='Preference']")).click();
        //driver.findElement(By.xpath("//android.widget.TextView[@text='4. Default values']")).click();
        //driver.findElement(By.xpath("//android.widget.TextView[@text='Edit text preference']")).click();

    }
}
// android.widget.TextView[@test='Preference']
// objectType[@attribute='value']