package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

import java.util.ArrayList;
import java.util.List;

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
    public WebElement favorites;

    @FindBy(xpath = "//th[contains (text(), 'Repair Reference')]")
    public WebElement firstColumnName;

    @FindBy(xpath = "//th[contains (text(), 'Product to Repair')]")
    public WebElement secondColumnName;

    @FindBy(xpath = "//th[contains (text(), 'Customer')]")
    public WebElement thirdColumnName;

    @FindBy(xpath = "//th[contains (text(), 'Delivery Address')]")
    public WebElement fourthColumnName;

    @FindBy(xpath = "//th[contains (text(), 'Warranty Expiration')]")
    public WebElement fifthColumnName;

    @FindBy(xpath = "//th[contains (text(), 'Status')]")
    public WebElement sixthColumnName;


public List<WebElement> getTableColumnNames(){
    List<WebElement> listOfTableColumnNames = new ArrayList<WebElement>();
    listOfTableColumnNames.add(null);
    listOfTableColumnNames.add(firstColumnName);
    listOfTableColumnNames.add(secondColumnName);
    listOfTableColumnNames.add(thirdColumnName);
    listOfTableColumnNames.add(fourthColumnName);
    listOfTableColumnNames.add(fifthColumnName);
    listOfTableColumnNames.add(sixthColumnName);
    return listOfTableColumnNames;


}






}
