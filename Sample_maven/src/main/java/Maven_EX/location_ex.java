package Maven_EX;


	import org.openqa.selenium.chrome.ChromeDriver;
	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;

	public class location_ex {
		public static void main(String args[]) throws InterruptedException {
			System.out.printf("Hello and welcome");
			WebDriver driver= new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http://www.saucedemo.com/");
			Thread.sleep(2000);
			WebElement usrnm=driver.findElement(By.id("user-name"));
					WebElement usrnm1=null;
		  usrnm1.sendKeys("standards usr");
		}
	}



