package Pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class signup_page {
	
	WebDriver driver;
	
	@Test
	public void signup1() {
		driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.demoblaze.com/");
	}
	
	@Test
	public void signup2() {
		driver.findElement(By.id("signin2")).click();
	}
	
	@Test
	public void signup3() throws InterruptedException {
		 Thread.sleep(2000); 
	        
	        driver.findElement(By.id("sign-username"))
	              .sendKeys("LathaTest123");

	        driver.findElement(By.id("sign-password"))
	              .sendKeys("Password123");
	    
	}
	
	@Test
	public void signup4() {
		 driver.findElement(By.xpath("//button[text()='Sign up']")).click();
	}
	
	@Test
	public void signup5() throws InterruptedException {
		Thread.sleep(2000);

        String alertMessage = driver.switchTo().alert().getText();
        System.out.println("Alert Message: " + alertMessage);

        driver.switchTo().alert().accept();
        driver.quit();
	}
}
