package seleniumPrograms;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.JavascriptExecutor;

public class NewWindow {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.naukri.com/");	
		Thread.sleep(2000);
		
		String title = driver.getTitle();
		System.out.println("The title of the page is: "+title);
		Thread.sleep(2000);
		
		driver.findElement(By.className("acceptance-btn")).click();		
		Thread.sleep(2000);
		WebElement elemnt = driver.findElement(By.xpath("//div[@id='premium-collection-wdgt']/div/a"));
        new Actions(driver)
                .scrollToElement(elemnt)
                .perform();
        elemnt.click();
		//WebElement bodyElement = driver.findElement(By.tagName("body"));
        //bodyElement.sendKeys(Keys.PAGE_DOWN);
        /*
        JavascriptExecutor js = (JavascriptExecutor)(driver);
        js.executeScript("window.scrollBy(0, 1000)");        
        Thread.sleep(2000);
        
        js.executeScript("window.scrollTo(0, document.body.scrollHeight)");        
        //driver.findElement(By.linkText("About us")).click();
        Thread.sleep(2000);
        
        WebElement elemnt = driver.findElement(By.xpath("//div[@id='premium-collection-wdgt']/div/a"));
        js.executeScript("arguments[0].scrollIntoView()", elemnt);
        elemnt.click();*/
        Thread.sleep(5000);
        
        driver.quit();
		//driver.findElement(By.className("qsb-title")).click();
		//driver.findElement(By.className("qsbSubmit")).sendKeys(Keys.PAGE_DOWN);
		
		//driver.findElement(By.className("qsbSubmit")).sendKeys(Keys.PAGE_DOWN);
		
        //FOR POP UPS
		//driver.switchTo().alert().dismiss();
        //driver.switchTo().alert().accept();
		
        //FOR FRAMES
        //driver.switchTo().frame(0);
        //driver.switchTo().defaultContent();
        
        //FOR NEW WINDOWS
        //driver.switchTo().window(title);        
        //driver.getWindowHandle();
	}

}
