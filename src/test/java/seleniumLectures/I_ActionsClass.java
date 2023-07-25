package seleniumLectures;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class I_ActionsClass {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();

		WebDriver driver;

		driver = new ChromeDriver();

		//driver.get("https://corammerswork.ml/wordpress/test1/");

		driver.manage().window().fullscreen();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();

		driver.navigate().to("https://www.ebay.com.au/");

		WebElement electornics = driver.findElement(By.xpath("//li[@class='hl-cat-nav__js-tab']/a[text()='Electronics']"));

		System.out.println(" ******************Here is the MovetoElement actions lecture********************* ");

		Actions actions2 = new Actions(driver);
		Thread.sleep(2000);
		actions2.moveToElement(electornics).perform();
	
		WebElement cameras = driver.findElement(By.linkText("Cameras"));
	 
		actions2.moveToElement(cameras).click().perform();
	
		Thread.sleep(2000);
		//
		/*
		 * Or we can also directly click our object as below:
		 * 
		 * cameras.click();
		 * );
		 * 
		 */

		
		  
		  
		/*
		 * 
		 * Other actions class methods :
		 * 
		 * actions2.moveToElement(cameras).contextClick().perform();
		 * actions2.moveToElement(cameras).doubleClick().build().perform();
		 * 
		 */  
		  
		

		  
		 
		   driver.close();
		  }

}
