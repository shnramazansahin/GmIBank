package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Mainpage {
    public Mainpage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(xpath = "//li[@id='account-menu']")
    public  WebElement manIcon;

   @FindBy(linkText = "Sign in")
   public  WebElement singInButton;

}
