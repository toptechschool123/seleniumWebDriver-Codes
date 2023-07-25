package seleniumLectures;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class O_PrintAllLinks {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.opencart.com/");
		
		
		driver.manage().window().maximize();
		
		List<WebElement>allLinks = driver.findElements(By.tagName("a"));
		System.out.println(allLinks.size());
	
		for(int i=0; i<allLinks.size(); i++) 
			
		{
			//System.out.println(allLinks.get(i).getAttribute("href"));
			System.out.println(allLinks.get(i).getAttribute("href"));
			
			//System.out.println(allLinks.get(i).getText());
			
	}
	}
}
