package seleniumLectures;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Q_DynamicDropDown2 {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.makemytrip.com/");
		         
		
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
		WebElement alertRemove= driver.findElement(By.xpath("//div[@class='makeFlex hrtlCenter prependTop5 appendBottom40']"));
		alertRemove.click();
		Thread.sleep(2000);
		WebElement fromBttn = driver.findElement(By.xpath("//span[text()='From']"));
		fromBttn.click();
		Thread.sleep(2000);
		WebElement from_City = driver.findElement(By.xpath("//p[text()='New Delhi, India']"));
		from_City.click();
		Thread.sleep(2000);
		WebElement toCity = driver.findElement(By.id("toCity"));
		toCity.click();
		Thread.sleep(2000);
		WebElement destination_city = driver.findElement(By.xpath("(//p[@class='font14 appendBottom5 blackText'])[3]"));
		destination_city.click();
		Thread.sleep(2000);
		
		
		driver.close();
		// span[text()='From']
		// p[text()='New Delhi, India']
		// p[text()='Bangkok, Thailand']
		//p[@class='font14 appendBottom5 blackText'])[3]
		//// input[@type='text' and @class='react-autosuggest__input
		// react-autosuggest__input--open']
	}

}
