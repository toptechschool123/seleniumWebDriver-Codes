package seleniumLectures;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class K_KeyboardActions {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		
		WebDriver driver;

		driver = new ChromeDriver();

		//driver.get("https://corammerswork.ml/wordpress/test1/");

		driver.manage().window().fullscreen();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().deleteAllCookies();
		
		
		
		
		driver.get("https://extendsclass.com/text-compare.html");
		WebElement sourcetext = driver.findElement(By.xpath("//div[@id='dropZone']"));
		
		Actions action4 = new Actions(driver);


		action4.keyDown(sourcetext,Keys.CONTROL).sendKeys("a").sendKeys("c").build().perform();
		Thread.sleep(2000);
		
		WebElement droptext = driver.findElement(By.xpath("//div[@class='CodeMirror cm-s-default']"));

		action4.keyDown(droptext, Keys.CONTROL).sendKeys("a").sendKeys("v").build().perform();
		Thread.sleep(2000);
	}

}
