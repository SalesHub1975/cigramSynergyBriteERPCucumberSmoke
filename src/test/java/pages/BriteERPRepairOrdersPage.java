package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BriteERPRepairOrdersPage {

    public BriteERPRepairOrdersPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//button[@class='btn btn-sm btn-default o_button_import']")
    public WebElement importButton;

    @FindBy(xpath = "//li[contains(text(), 'Repair Orders')]")
    public WebElement repairOrdersHeader;


    @FindBy(xpath= "//input[@class='o_searchview_input']")
    public  WebElement searchBox;

    @FindBy(xpath = "//span[@class='o_searchview_more fa fa-search-plus']")
    public WebElement plusButton;

    @FindBy( xpath = "(//button[@class='o_dropdown_toggler_btn btn btn-sm dropdown-toggle'])[3]")
    public WebElement filters;

    @FindBy(xpath = "(//button[@class='o_dropdown_toggler_btn btn btn-sm dropdown-toggle'])[4]")
    public WebElement groupBy;

    @FindBy(xpath = "(//button[@class='o_dropdown_toggler_btn btn btn-sm dropdown-toggle'])[5]")
    public WebElement favoriets;


}
