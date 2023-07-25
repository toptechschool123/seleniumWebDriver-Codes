package seleniumLectures;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class E_WebElement_FindElements {

	public static void main(String[] args) throws InterruptedException {

		ChromeOptions chromeOptions = new ChromeOptions();
		chromeOptions.addArguments("--remote-allow-origins=*");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);

		// driver.get("https://www.sugarcrm.com");
		//driver.get("https://www.opencart.com/");
		driver.get("https://toptechschool.dailydebuggers.tech/");
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		List<WebElement> links = driver.findElements(By.tagName("a"));
		links.size();
		System.out.println(links.size());
		Thread.sleep(3000);
		for (int i = 0; i < links.size(); i++) {
			String all_links = links.get(i).getAttribute("href");
			System.out.println(all_links);

			driver.close();
		}
	}

}
