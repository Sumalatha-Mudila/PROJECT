package Maven_EX;


	import org.openqa.selenium.By;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.chrome.ChromeDriver;
	                                                                                                                                                                  
	public class ABS_Xpath {
		public static void main(String[]args) throws InterruptedException {
			WebDriver driver=new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("http:/www.google.com");
			Thread.sleep(3000);
			driver.findElement(By.name("/html/head/metal[2])")).click();
			driver.quit();
		}
	 
	} 


