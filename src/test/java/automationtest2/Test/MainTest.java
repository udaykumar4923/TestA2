package automationtest2.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MainTest {
	WebDriver driver ;
	
	@BeforeTest
	public void launchBrowser() {
	 driver = new ChromeDriver();
		driver.get("http://10.0.31.161:9292/ ");
		
	}
	
	@Test
	public void BasicAuthTest() {
		driver.findElement(By.linkText("Basic Auth")).click();
		driver.switchTo().alert().accept();	
	}
	
	public void 
}
