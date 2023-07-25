package seleniumLectures;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class H_CheckBoxes {

	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();

		WebDriver driver;

		driver = new ChromeDriver();

		driver.get("https://corammerswork.ml/wordpress/test1/");

		 driver.manage().window().fullscreen();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();

		WebElement myAccount = driver.findElement(By.className("action_button"));
		Thread.sleep(2000);
		myAccount.click();
		System.out.println("********clicking on myAccount ********");
		Thread.sleep(2000);
		WebElement userName = driver.findElement(By.id("username"));
		userName.sendKeys("sayed@rewa.org");
		Thread.sleep(2000);
		WebElement userEmail = driver.findElement(By.id("password"));
		userEmail.sendKeys("House@$123456789");
		Thread.sleep(2000);
		WebElement checkBox = driver.findElement(By.id("rememberme"));
		checkBox.click();
		System.out.println(checkBox.isSelected());
		Thread.sleep(2000);
		WebElement login = driver.findElement(By.name("login"));
		login.click();
		
		driver.close();
	}

}
