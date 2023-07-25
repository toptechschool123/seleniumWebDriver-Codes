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

public class P_DynamicDropDown {

	public static void main(String[] args) throws Exception {

		// It needs some work to do

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(40));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
		
		
		driver.get("https://www.makemytrip.com");
		
		R_ScreenShot.takeScreenShot(driver);
		WebElement alertRemove = driver.findElement(By.xpath("//div[@class='makeFlex hrtlCenter prependTop5 appendBottom40']"));
		alertRemove.click();
		Thread.sleep(2000);
		R_ScreenShot.takeScreenShot(driver);

		
		  File screenshotFile = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE); // String screenshotBase64 =
		  //((TakesScreenshot) element).getScreenshotAs(OutputType.BASE64);
		  FileUtils.copyFile(screenshotFile, new File (".//screenshot/pic.png"));
		  
		  
		WebElement fromBttn = driver.findElement(By.xpath("//span[text()='From']"));
		fromBttn.click();

		WebElement fromBttn2 = driver.findElement(By.xpath("//div[@class='react-autosuggest__container react-autosuggest__container--open']/input"));
		fromBttn2.sendKeys("Pun");

		Thread.sleep(2000);
		R_ScreenShot.takeScreenShot(driver);
		List<WebElement> Drop_list = driver.findElements(By.xpath("//ul[@class='react-autosuggest__suggestions-list']/li/div/div/p"));

		for (int i = 0; i < Drop_list.size(); i++) {

			String text = Drop_list.get(i).getText();

			Dimension size = Drop_list.get(i).getSize();
			System.out.println(size);
			System.out.println("Text is " + text);

			if (text.contains("Pune")) {
				Drop_list.get(i).click();
				break;

			}

		}
		driver.close();
	}
}
