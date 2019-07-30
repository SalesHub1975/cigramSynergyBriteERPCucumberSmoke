package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.BriteERPImportPage;
import pages.BriteERPRepairOrdersPage;
import utilities.Driver;

import java.util.Set;

public class HelpButton_Steps {

    @Given("user is on the repairs module main page")
    public void user_is_on_the_repairs_module_main_page() {
        //
    }

    @When("user clicks import button")
    public void user_clicks_import_button() {
        BriteERPRepairOrdersPage briteERPRepairOrdersPage = new BriteERPRepairOrdersPage();
        briteERPRepairOrdersPage.importButton.click();
    }

    @When("user clicks on help  button")
    public void user_clicks_on_help_button() {
        BriteERPImportPage briteERPImportPage = new BriteERPImportPage();
        briteERPImportPage.helpButton.click();
    }

    @Then("user should be able verify if the current url matches with the expected url")
    public void user_should_be_able_verify_if_the_current_url_matches_with_the_expected_url() {

        String currentHandle = Driver.getDriver().getWindowHandle();
        Set<String> list = Driver.getDriver().getWindowHandles();
        for (String handle : list) {
            if (!handle.equals(currentHandle)) {
                Driver.getDriver().switchTo().window(handle);
            }
        }

        String expectedURL = "https://www.odoo.com/documentation/user/11.0/general/base_import/import_faq.html";
        String actualURL = Driver.getDriver().getCurrentUrl();
        Assert.assertEquals("URL is not matching", actualURL, expectedURL);
    }

}
