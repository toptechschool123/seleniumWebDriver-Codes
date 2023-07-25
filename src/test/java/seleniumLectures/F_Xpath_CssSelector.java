package seleniumLectures;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class F_Xpath_CssSelector {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);

		driver.get("https://toptechschool.dailydebuggers.tech/");

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		/*
		 * Ways to create xpath 1. copy the xpath from developer tools
		 */

		WebElement search_Bttn = driver.findElement(By.id("searchvalue"));
		search_Bttn.click();
		Thread.sleep(3000);
		search_Bttn.sendKeys("computer");
		Thread.sleep(3000);
		WebElement search_Bar = driver.findElement(By.xpath("//button[@type='submit']"));
		search_Bar.click();
		Thread.sleep(3000);
		

		WebElement AddToCart = driver.findElement(By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[6]"));
		Thread.sleep(3000);
		AddToCart.click();
		Thread.sleep(3000);
		
		driver.close();
	}

}
