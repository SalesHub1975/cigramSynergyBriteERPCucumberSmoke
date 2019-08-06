package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BriteERPInboxPage {

public BriteERPInboxPage(){

    PageFactory.initElements(Driver.getDriver(), this);
}

@FindBy(xpath = "//span[contains(text(),'Repairs')]")
    public WebElement repairsButton;



}
