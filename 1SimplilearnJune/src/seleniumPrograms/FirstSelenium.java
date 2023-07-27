package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.edge.EdgeDriver;
//import org.openqa.selenium.firefox.FirefoxDriver;

public class FirstSelenium {
	public static void main(String[] args) throws Exception {
		WebDriver driver;
		//ChromeDriver driver = new ChromeDriver();
		//EdgeDriver driver = new EdgeDriver();
		//FirefoxDriver driver = new FirefoxDriver();
		
		//driver = new EdgeDriver();
		
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.bing.com/");		
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys("Mango");
		Thread.sleep(1000);
		driver.findElement(By.name("q")).sendKeys(Keys.ENTER);
		Thread.sleep(2000);
		
		driver.quit();
	}
}