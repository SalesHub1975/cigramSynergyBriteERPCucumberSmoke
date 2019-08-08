package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BriteERPImportPage {

    public BriteERPImportPage(){
        PageFactory.initElements(Driver.getDriver(), this);
    }

    @FindBy(xpath = "//a[@class='pull-right']")
    public WebElement helpButton;

    @FindBy(css = ".breadcrumb")
    public WebElement repairsOrderHeader;
}
