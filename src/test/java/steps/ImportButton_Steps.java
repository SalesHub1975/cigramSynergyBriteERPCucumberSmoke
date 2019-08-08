package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BriteERPImportPage;
import pages.BriteERPRepairOrdersPage;
import utilities.Driver;

public class ImportButton_Steps {






    @When("user verifies import button is displayed")
    public void user_verifies_import_button_is_displayed()  {
        BriteERPRepairOrdersPage briteERPRepairOrdersPage = new BriteERPRepairOrdersPage();
        Assert.assertTrue(briteERPRepairOrdersPage.importButton.isDisplayed());

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(briteERPRepairOrdersPage.importButton));

        briteERPRepairOrdersPage.importButton.click();

    }

    @Then("user should verify that page header contains {string}")
    public void user_should_verify_that_page_header_contains(String header)  {


        BriteERPImportPage briteERPImportPage = new BriteERPImportPage();

        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        wait.until(ExpectedConditions.visibilityOf(briteERPImportPage.repairsOrderHeader));

        Assert.assertTrue("Import a File doesn't displayed" , briteERPImportPage.repairsOrderHeader.getText().contains(header));

    }

}