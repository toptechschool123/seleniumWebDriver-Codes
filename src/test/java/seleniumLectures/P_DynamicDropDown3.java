package seleniumLectures;

import java.io.File;
import java.io.IOException;
import java.time.Duration;
import java.util.List;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.dockerjava.api.model.Driver;

public class P_DynamicDropDown3 {

	public static void main(String[] args) throws Exception {

		// It needs some work to do

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
		driver.get("https://www.makemytrip.com");
		
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

			

		
		driver.close();
	}
}
