package seleniumLectures;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class N_StaticDropDown {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.opencart.com/index.php?route=account/register");

		WebElement registerBttn = driver.findElement(By.xpath("(//a[text()='Register'])[2]"));
		registerBttn.click();
		Thread.sleep(2000);

		WebElement userName = driver.findElement(By.id("input-username"));
		userName.sendKeys("Sayed");
		Thread.sleep(2000);
		
		WebElement firstName = driver.findElement(By.id("input-firstname"));
		firstName.sendKeys("Sayed Ibrahim");
		Thread.sleep(2000);
		
		WebElement lastName = driver.findElement(By.id("input-lastname"));
		lastName.sendKeys("sadat");
		Thread.sleep(2000);
		
		WebElement Email = driver.findElement(By.id("input-email"));
		Email.sendKeys("sayed@yahoo.com");
		Thread.sleep(2000);
		
		WebElement country_DropDown = driver.findElement(By.id("input-country"));
		country_DropDown.click();
		Thread.sleep(2000);
		
		Select selectobj = new Select(country_DropDown);
		Thread.sleep(2000);
		
		// selectobj.selectByIndex(1);
		selectobj.selectByValue("1");
		selectobj.selectByVisibleText("United States");
		Thread.sleep(2000);
		
		WebElement password = driver.findElement(By.id("input-password"));
		password.sendKeys("1234");
		Thread.sleep(2000);
		
		WebElement submit = driver.findElement(By.xpath("//button[@type='submit' and@class='btn btn-primary btn-lg hidden-xs']"));
		submit.click();

		//driver.close();
	}

}
