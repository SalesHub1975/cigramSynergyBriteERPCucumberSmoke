package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)

@CucumberOptions(

        plugin = "html:target/cucumberReports",
        features = "src/test/resources/features",
        glue = "steps",
        tags = "@helpButtonVerification",
        dryRun = false

)

public class Runner {


}
