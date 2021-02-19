package gmibank.stepdefinitions;

import cucumber.api.java.en.Given;
import gmibank.pages.Loginpage;
import gmibank.pages.Mainpage;
import gmibank.utilities.Driver;

public class firststep {
    Mainpage mainpage= new Mainpage();
    Loginpage loginpage = new Loginpage ();

    @Given("user goes to mainpage")
    public void user_goes_to_mainpage() {
        Driver.getDriver().get("http://www.gmibank.com/login");
    }

//    @When("user clicks on the {string}")
//    public void user_clicks_on_the(String string) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
//    }
//
//    @When("user goes to sign in page")
//    public void user_goes_to_sign_in_page() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
//    }
//
//    @When("user fills {string}")
//    public void user_fills(String string) {
//        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
//    }
//
//    @Then("click on the sign in and verify the error message")
//    public void click_on_the_sign_in_and_verify_the_error_message() {
//        // Write code here that turns the phrase above into concrete actions
//        throw new cucumber.api.PendingException();
//    }
}
