package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BingFormAllLocators {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		//ChromeDriver driver = new ChromeDriver();
		//EdgeDriver driver = new EdgeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		
		//driver = new EdgeDriver();
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bing.com/");	
		Thread.sleep(2000);
		driver.findElement(By.name("q")).sendKeys("Mango");
		Thread.sleep(1000);
		driver.findElement(By.id("id_sc")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("hbsettings")).click();
		Thread.sleep(1000);
		driver.findElement(By.linkText("More")).click();
		Thread.sleep(1000);
		driver.findElement(By.id("adlt_set_strict")).click();
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("inappropriate content?")).click();		
		Thread.sleep(1000);
		driver.findElement(By.partialLinkText("inappropriate content?")).sendKeys(Keys.PAGE_DOWN);
		Thread.sleep(1000);
		driver.findElement(By.xpath("//input[@id='newwnd']")).click();		
		Thread.sleep(1000);
		driver.findElement(By.cssSelector("#rpp")).sendKeys("30");
		Thread.sleep(5000);
		driver.findElement(By.id("cancel_changes_button")).click();		
		Thread.sleep(2000);
		
		driver.quit();
	}
}
