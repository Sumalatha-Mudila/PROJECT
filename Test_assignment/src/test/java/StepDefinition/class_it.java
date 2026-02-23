package StepDefinition;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class class_it {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https:www.google.com");
		driver.get("https://github.com/");
		driver.quit();
	}
	

}
