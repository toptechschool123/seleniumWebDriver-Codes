package seleniumLectures;
import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;
import utils.ScreenShot;

public class A_WebDriverManagers extends ScreenShot {

	public static void main(String[] args) throws IOException {

	
		ChromeOptions option = new ChromeOptions();
        option.addArguments("--remote-allow-origins=*");

        WebDriverManager.chromedriver().setup();
        WebDriver driver;
        driver = new ChromeDriver(option);
      
		

	

		String url = "https://demo.opencart.com/ ";
		driver.get(url);

		ScreenShot.takesScreenShot(driver);
		
		driver.close();

	}

}
