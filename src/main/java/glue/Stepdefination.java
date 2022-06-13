package glue;

import base.BaseClass;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.WebDriver;

import Utilites.screenshot;

public class Stepdefination  {

    BaseClass baseClass = new BaseClass();
    public static WebDriver driver = BaseClass.driver;
    
    @Given("User will open chrome Browser")
    public void user_will_open_chrome_browser() {
        // Write code here that turns the phrase above into concrete actions
        
    }

    @When("User will open Amazon URL {string}")
    public void user_will_open_amazon_url(String string) {
        // Write code here that turns the phrase above into concrete actions
       
    }

    @When("user will Search Product in Search Box {string}")
    public void user_will_search_product_in_search_box(String string) {
        // Write code here that turns the phrase above into concrete actions
      
    }

    @Then("user will navigate to products list and click on product")
    public void user_will_navigate_to_products_list_and_click_on_product() {
        // Write code here that turns the phrase above into concrete actions
       
    }

    @Then("User will be on new window and click on Add cart")
    public void user_will_be_on_new_window_and_click_on_add_cart() {
        // Write code here that turns the phrase above into concrete actions
      
    }

    @Then("Validate the add to cart message")
    public void validate_the_add_to_cart_message() {
        // Write code here that turns the phrase above into concrete actions
      
    }

}
