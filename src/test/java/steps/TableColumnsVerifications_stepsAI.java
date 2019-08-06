package steps;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import pages.BriteERPRepairOrdersPage;
import utilities.Driver;

public class TableColumnsVerifications_stepsAI {

    BriteERPRepairOrdersPage brite = new BriteERPRepairOrdersPage();

    @Then("user should be able to verify that column {string} has {string}")
    public void user_should_be_able_to_verify_that_column_has(String string, String string2) {
        WebDriverWait wait = new WebDriverWait(Driver.getDriver(), 10);
        WebElement columnName;
        columnName = wait.until(ExpectedConditions.visibilityOf(
                brite.getTableColumnNames().get(Integer.parseInt(string))));

       Assert.assertTrue("Column name is not matching",
               columnName.getText().equalsIgnoreCase(string2));
    }
}
