package seleniumLectures;

import java.time.Duration;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.swing.text.Utilities;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class T_DatePicker2 {


	public static void main(String[] args) throws InterruptedException {

		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();

		driver.get("https://www.aa.com/homePage.do");

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(60));
		driver.manage().deleteAllCookies();

		JavascriptExecutor js = ((JavascriptExecutor) driver);
		// js.executeAsyncScript("window.scrollTo(0,document.body.scrollHeight,arg1)");
		js.executeScript("window.scrollBy(0,400)");

		WebElement cookiebutton = driver.findElement(By.xpath("//button[@name='closeBannerButton']"));
		cookiebutton.click();

		WebElement from = driver.findElement(By.xpath("(//input[@name='originAirport'])[1]"));
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].click();", from);

		Thread.sleep(2000);
		from.clear();
		Thread.sleep(2000);
		from.sendKeys("Seat");
		Thread.sleep(5000);

		List<WebElement> departureFrom = driver.findElements(By.xpath("//ul[@id='ui-id-1']/li/a"));
		String size = departureFrom.get(0).getText();
		System.out.println(size);
		for (WebElement city : departureFrom) {

			if (city.getText().trim().contains("Seattle Lake")) {
				city.click();
			}

		}

		WebElement destinationTo = driver
				.findElement(By.xpath("//input[@id='reservationFlightSearchForm.destinationAirport']"));
		destinationTo.click();
		// executor.executeScript("arguments[0].click();", toDestination);

		Thread.sleep(2000);
		destinationTo.clear();
		Thread.sleep(2000);
		destinationTo.sendKeys("Virg");
		Thread.sleep(2000);

		List<WebElement> pickCity = driver.findElements(By.xpath("//ul[@id='ui-id-2']/li"));
	String size1 = pickCity.get(0).getText();
		System.out.println(size1);
		for (WebElement city2 : pickCity) {

			if (city2.getText().trim().contains("VIJ")) {

				city2.click();
			}

		}
		
		
		
	WebElement dropDown = 	driver.findElement(By.id("flightSearchForm.adultOrSeniorPassengerCount"));
	dropDown.click();
	
	Select select = new Select(dropDown);
		
	select.selectByIndex(4);
	String text=dropDown.getText();
	System.out.println(text);
	
	WebElement departDate = 	driver.findElement(By.xpath("//input[@name='departDate']"));
	Thread.sleep(2000);
	WebElement returntDate = 	driver.findElement(By.xpath("//input[@name='returnDate']"));
	Thread.sleep(2000);
	WebElement searchBttn = 	driver.findElement(By.xpath("//input[@id='flightSearchForm.button.reSubmit']"));
	Thread.sleep(2000);
//	String departureDate = "01/20/2023";
//	String arrivalDate = " 02/20/2023";
	
	 ((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('value','01/20/2023')", departDate);
	 Thread.sleep(2000);
	 ((JavascriptExecutor) driver).executeScript("arguments[0].setAttribute('value','02/20/2023')", returntDate);
	 Thread.sleep(2000);
	 
		/*
		 * utils.selectCalendarDatewithJS(driver, departureDate, departDate);
		 * utils.selectCalendarDatewithJS(driver, arrivalDate, returntDate);
		 */
	searchBttn.click();
	Thread.sleep(2000);
		driver.close();

	}

}
