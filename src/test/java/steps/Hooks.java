package steps;

import cucumber.api.Scenario;
import org.junit.After;
import org.junit.Before;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import utilities.Driver;

public class Hooks {

    @Before

    public void setup(Scenario scenario){

        System.out.println("Hooks  set up for: " + scenario.getName());
    }

    @After

    public void tearDown(Scenario scenario){

        System.out.println("Hooks teardown for: " + scenario.getName());
        System.out.println("Status: " + scenario.getStatus());

        if(scenario.isFailed()){
            byte [] screenShot = ((TakesScreenshot) Driver.getDriver()).getScreenshotAs(OutputType.BYTES);

            scenario.embed(screenShot,"image/png");

        }

        Driver.quitDriver();
    }


}
