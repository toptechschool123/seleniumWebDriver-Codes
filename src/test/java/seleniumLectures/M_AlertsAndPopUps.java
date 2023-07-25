package seleniumLectures;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class M_AlertsAndPopUps {

	public static void main(String[] args) {
		/*
		 * What is Alert on the page appear ? An Alert in Selenium is a small message
		 * box which appears on screen to give the user some information or
		 * notification. It notifies the user with some specific information or error,
		 * asks for permission to perform certain tasks and it also provides warning
		 * messages as well.
		 */

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_alert");
		driver.manage().window().fullscreen();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		WebElement iframe = driver.findElement(By.id("iframeResult"));
		driver.switchTo().frame(iframe);
		WebElement tryBttn = driver.findElement(By.xpath("/html/body/button"));
		tryBttn.click();
		
	
		Alert alert = driver.switchTo().alert();
		alert.getText();
		String alertMsg = alert.getText();
		alert.accept();
		System.out.println(alertMsg);
	
				

		/*
		 * 
		 * //Interface Alert has the following methods: accept(),
		 * dismiss();,getText();,sendKeys(); // Implementation and usage is as follows:
		 * WebDriver.TargetLocator.alert() driver.switchTo().alert();
		 * 
		 * 
		 * //Alert alert = driver.switchTo().alert(); // switch to alert
		 * 
		 * String alertMessage= driver.switchTo().alert().getText(); // capture alert
		 * message
		 * 
		 * System.out.println(alertMessage); // Print Alert Message
		 * 
		 * driver.switchTo().alert().accept(); driver.switchTo().alert().dismiss();
		 * driver.switchTo().alert().sendKeys(""); driver.switchTo().alert().getText();
		 */

	}

}
