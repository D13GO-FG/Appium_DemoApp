package runner;

import io.cucumber.testng.CucumberOptions;
import tests.BaseTest;

@CucumberOptions(
        tags = "@SmokeTest",
        features = "src/test/resources/features",
        glue = {"stepDefinitions", "runner"},
        plugin = {"pretty","html:target/cucumber-html-report.html"}
)
public class testRunner extends BaseTest {
}
