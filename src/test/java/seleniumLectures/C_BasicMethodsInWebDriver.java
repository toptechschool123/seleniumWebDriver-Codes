package seleniumLectures;

import java.time.Duration;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class C_BasicMethodsInWebDriver {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver = new ChromeDriver();
		driver.get("https://jqueryui.com");

		driver.manage().window().fullscreen();
		//driver.manage().window().maximize();
		//driver.manage().window().minimize()
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		String pageSource = driver.getPageSource();
		// System.out.println(pageSource);

		String currentUrl = driver.getCurrentUrl();
		System.out.println(currentUrl);

		String pageTitle = driver.getTitle();
		System.out.println("It is the title of the Page " + pageTitle);

		


	
		Thread.sleep(3000);
	
		driver.navigate().to("https://ksrtc.in/oprs-web/");
		Thread.sleep(3000);
		driver.navigate().back();
		Thread.sleep(3000);
		driver.navigate().forward();
		Thread.sleep(3000);
		//Refresh the current page
		driver.navigate().refresh();
	

		

		//driver.quit();
		driver.close();
		
	

	}

}
