package steps;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import pages.BriteERPInboxPage;
import pages.BriteERPRepairOrdersPage;

public class SearchBox_stepsGN {


    BriteERPRepairOrdersPage bERP = new BriteERPRepairOrdersPage();

    @When("user verifies search box is displayed")
    public void user_verifies_search_box_is_displayed() {
        Assert.assertTrue("search box is not displayed", bERP.searchBox.isDisplayed());
    }


    @When("user clicks on +\\(plus) button")
    public void user_clicks_on_plus_button() {
        bERP.plusButton.click();
    }


    @Then("user should be able to see three popped up buttons: Filters, Group by, Favorites")
    public void user_should_be_able_to_see_three_popped_up_buttons_Filters_Group_by_Favorites() {
        Assert.assertTrue("Filters is not displayed", bERP.filters.isDisplayed());
        Assert.assertTrue("Groupby box is not displayed", bERP.groupBy.isDisplayed());
        Assert.assertTrue("Favorites box is not displayed", bERP.favorites.isDisplayed());
    }



}
