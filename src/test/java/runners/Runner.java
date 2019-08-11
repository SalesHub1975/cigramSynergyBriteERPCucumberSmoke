package runners;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        plugin = {"html:target/cucumberReports", "json:target/report.json", "pretty"},
        features = "src/test/resources/features",
        glue = "steps",
         tags = "@searchBoxVerification",
        dryRun = false,
        monochrome=true
)
public class Runner {

}
