package steps;

import cucumber.api.java.en.*;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BriteERPInboxPage;
import pages.BriteERPLoginPage;
import pages.BriteERPRepairOrdersPage;
import utilities.Config;
import utilities.Driver;

public class RepairOrders_Steps {

    BriteERPLoginPage briteERPLoginPage = new BriteERPLoginPage();
    BriteERPInboxPage briteERPInboxPage = new BriteERPInboxPage();
    BriteERPRepairOrdersPage briteERPRepairOrdersPage = new BriteERPRepairOrdersPage();

    @Given("user goes to login page")
    public void user_goes_to_login_page() {
        Driver.getDriver().get(Config.getProperty("briteERPURL"));
    }

    @When("user logs in as a manager")
    public void user_logs_in_as_a_manager() {
        briteERPLoginPage.emailInput.sendKeys(Config.getProperty("loginInventoryManager4"));
        briteERPLoginPage.passwordInput.sendKeys(Config.getProperty("passwordInventoryManager4"));
        briteERPLoginPage.loginButton.click();
    }

    @When("user clicks on the repairs module button")
    public void user_clicks_on_the_repairs_module_button() {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        WebElement repairsButton;
        repairsButton = wait.until(ExpectedConditions.visibilityOf(
                briteERPInboxPage.repairsButton));
        repairsButton.click();
    }

    @Then("user should be able to see {string} in the page title")
    public void user_should_be_able_to_see_in_the_page_title(String string) {
        String expectedResult = string;
        String actualResult = briteERPRepairOrdersPage.repairOrdersHeader.getText();

        Assert.assertEquals("Page header is not matching", expectedResult, actualResult);
    }

}
