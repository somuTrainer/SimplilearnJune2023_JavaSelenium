package seleniumPrograms;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class SelectDropdown {

	public static void main(String[] args) throws Exception {
		WebDriver driver;
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://register.rediff.com/register/register.php?FormName=user_details");	
		Thread.sleep(2000);
		
		String title = driver.getTitle();
		System.out.println("The title of the page is: "+title);
		
		WebElement countryDropdown = driver.findElement(By.id("country"));
		//int a = 20;
		
		Select select = new Select(countryDropdown);
		select.selectByIndex(5);
		
		WebElement selectedElement = select.getFirstSelectedOption();
		System.out.println("The selected country value is: "+selectedElement.getText());
		Thread.sleep(2000);
		select.selectByVisibleText("Bolivia");
		selectedElement = select.getFirstSelectedOption();
		System.out.println("The selected country value is: "+selectedElement.getText());
		Thread.sleep(2000);
		select.selectByValue("20");
		selectedElement = select.getFirstSelectedOption();
		System.out.println("The selected country value is: "+selectedElement.getText());
		
		
		List<WebElement> countries = select.getOptions();
		System.out.println("The total no. of countries in the dropdown are: "+countries.size());
		
		for(int i=0;i<countries.size();i++) {
			select.selectByIndex(i);
			WebElement selectedEle = select.getFirstSelectedOption();
			System.out.println("The selected country value is: "+selectedEle.getText());

			
		}
	}

}
