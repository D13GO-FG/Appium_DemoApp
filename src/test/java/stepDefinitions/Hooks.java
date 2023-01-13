package stepDefinitions;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import tests.BaseTest;

import java.net.MalformedURLException;

public class Hooks {

    @Before
    public static void setUp() throws MalformedURLException {
        BaseTest.setUpDriver();
    }
    @After
    public static void tearDown(){
        BaseTest.tearDown();
    }
}
