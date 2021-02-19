package gmibank.pages;

import gmibank.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Loginpage {
    public Loginpage() {
        PageFactory.initElements(Driver.getDriver(),this);
    }
    @FindBy(id="username")
    public WebElement username;

    @FindBy(id="password")
    public WebElement password;

    @FindBy(linkText="Sign in")
    public WebElement SignInButton;
}
