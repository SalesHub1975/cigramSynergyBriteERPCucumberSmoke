package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BriteERPRepairOrdersPage {

    public BriteERPRepairOrdersPage(){

        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//button[@type='button'])[8]")
    public WebElement importButton;

    @FindBy(xpath = "//li[contains(text(), 'Repair Orders')]")
    public WebElement repairOrdersHeader;

    

}
