package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import utilities.Driver;

public class BriteERPLoginPage {

public BriteERPLoginPage(){

    PageFactory.initElements(Driver.getDriver(), this);
}


    @FindBy(id = "login")
    public WebElement emailInput;

    @FindBy (id = "password")
    public WebElement passwordInput;

    @FindBy (css = "button[type='submit']")
    public WebElement loginButton;


//    public void briteERPLogin (String email, String password) {
//        emailInput.sendKeys(email);
//        passwordInput.sendKeys(password);
//        loginButton.click();
//    }

}
