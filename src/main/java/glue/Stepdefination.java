package glue;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Stepdefination  {

    BaseClass baseClass = new BaseClass();
    @Given("User will open chrome browser")
    public void user_will_open_chrome_browser() {
        // Write code here that turns the phrase above into concrete actions
        System.out.println("Chrome browser");
        baseClass.WebCapture(baseClass.driver,"screen");
    }
    @When("User will navigate to")
    public void user_will_navigate_to() {
        // Write code here that turns the phrase above into concrete actions
        baseClass.WebCapture(baseClass.driver,"screen");
    }

    @Then("User will login with validate Credinatials")
    public void user_will_login_with_validate_credinatials() {
        // Write code here that turns the phrase above into concrete actions
        baseClass.WebCapture(baseClass.driver,"screen");
    }

}
