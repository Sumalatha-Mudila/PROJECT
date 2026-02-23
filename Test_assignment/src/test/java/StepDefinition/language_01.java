package StepDefinition;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class language_01 {
	WebDriver driver;
	WebDriverWait wait;
	@Given("user open the times of India website {string}")
	public void i_open_the_times_of_india_website(String string) {
	    driver=new ChromeDriver();
	    driver.get(string);
	}

	@When("wait for the page to load")
	public void i_wait_for_the_page_to_load() {
	    wait =new WebDriverWait(driver, Duration.ofSeconds(10));
	    wait.until(ExpectedConditions.urlContains("timesofindia"));
	}

	@When("select telugu language from the dropdown using relative XPath")
	public void i_select_telugu_language_from_the_dropdown_using_relative_x_path() {
	    driver.findElement(By.xpath("//select[@id='language-select']")).click();
	    driver.findElement(By.xpath("//option[contians(text(),telugu']")).click();
	}

	@Then("the language should be changed to telugu")
	public void the_language_should_be_changed_to_telugu() {
		System.out.println("language changed to telugu");
		driver.quit();
	   	}

}
