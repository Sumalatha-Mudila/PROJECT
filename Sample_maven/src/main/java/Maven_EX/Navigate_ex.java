package Maven_EX;


	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;

	public class Navigate_ex {
		public static void main(String[] args) throws InterruptedException {
			WebDriver driver =new ChromeDriver();
			driver.manage().window().maximize();
			driver.navigate().to("http://www.google.com");  
			driver.navigate().forward();
			driver.navigate().back();
			driver.navigate().refresh();
			Thread.sleep(2000);
			driver.quit();
		}
	}



