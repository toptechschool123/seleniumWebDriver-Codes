package seleniumLectures;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class G_RadioButtons {

	public static void main(String[] args) {
		

		WebDriverManager.chromedriver().setup();

		WebDriver driver;

		driver = new ChromeDriver();

		driver.get("https://www.singaporeair.com/en_UK/us/home#/book/bookflight");

		 driver.manage().window().fullscreen();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();

		WebElement radioBttn = driver.findElement(By.id("redeemFlights"));

		WebElement radioBttn2 = driver.findElement(By.id("bookFlights"));

		
		/*
		 * JavascriptExecutor executor = (JavascriptExecutor)driver;
		 * executor.executeScript("arguments[0].click();", checkbox);
		 * Thread.sleep(2000);
		 * 
		 * executor.executeScript("arguments[0].click();", checkbox);
		 * Thread.sleep(2000); executor.executeScript("arguments[0].click();",
		 * checkbox);
		 */

		// WebElement radioBttn =
		// driver.findElement(By.xpath("//input[@id='interest_market_c0']"));
		radioBttn.click();
		System.out.println(radioBttn.isSelected());
		System.out.println(radioBttn2.isSelected());
		
		List<WebElement> radioBttns = driver.findElements(By.name("book-flight-radio"));
		System.out.println(radioBttns.size());

		//driver.close();
	}

	}


