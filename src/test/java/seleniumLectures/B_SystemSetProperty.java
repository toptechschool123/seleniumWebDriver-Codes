package seleniumLectures;

import org.openqa.selenium.chrome.ChromeDriver;

public class B_SystemSetProperty {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\browsersDrivers\\chromedriver.exe");
		
			ChromeDriver driver = new ChromeDriver();
		
			String url = " https://corammerswork.ml/wordpress/test1/my-account/ ";
			 driver.get(url);
			
			 
			 driver.close();
			
			
			//	System.setProperty("webdriver.gecko.driver", "C:\\browsersDrivers\\geckodriver.exe");
			//	System.setProperty("webdriver.ie.driver", "C:\\browsersDrivers\\IEDriverServer.exe");
			//	System.setProperty("webdriver.edge.driver", "C:\\browsersDrivers\\msedgedriver.exe");
			//	FirefoxDriver driver = new FirefoxDriver();
			//	InternetExplorerDriver driver = new InternetExplorerDriver();
			//	InternetExplorerDriver driver = new InternetExplorerDriver();
			//	EdgeDriver driver = new EdgeDriver();
				
			
				
				
				
	}

}
