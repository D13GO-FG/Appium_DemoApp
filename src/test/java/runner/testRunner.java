package runner;

import io.cucumber.testng.AbstractTestNGCucumberTests;
import io.cucumber.testng.CucumberOptions;

@CucumberOptions(
        tags = "@SmokeLogin",
        features = "src/test/resources/features",
        glue = {"stepDefinitions", "runner"},
        plugin = {"pretty","html:target/cucumber-html-report.html"}
)
public class testRunner extends AbstractTestNGCucumberTests {
}
