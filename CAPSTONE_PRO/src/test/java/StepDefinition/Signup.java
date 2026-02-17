package StepDefinition;

import org.openqa.selenium.WebDriver;
import Pages.signup_page;
import io.cucumber.java.en.*;

public class Signup extends signup_page{

    WebDriver driver;
    signup_page signuppage;

    @Given("User launches the Demoblaze website")
    public void user_launches_the_demoblaze_website() {
    	signup1();
    }

    @When("User clicks on Sign up link")
    public void user_clicks_on_sign_up_link() {
        signup2();
        }

    @When("User enters username and password")
    public void user_enters_username_and_password() throws InterruptedException {
        signup3();
    }

    @When("User clicks on Sign up button")
    public void user_clicks_on_sign_up_button() {
        signup4();
    }

    @Then("User should see registration success message")
    public void user_should_see_registration_success_message() throws InterruptedException {
        signup5();
    }
}