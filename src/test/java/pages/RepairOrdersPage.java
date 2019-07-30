package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class RepairOrdersPage {

    public RepairOrdersPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "(//button[@type='button'])[8]")
    public WebElement importButton;

    @FindBy(xpath = "//ol[@class='breadcrumb']")
    public WebElement repairOrdersHeader;

    

}
