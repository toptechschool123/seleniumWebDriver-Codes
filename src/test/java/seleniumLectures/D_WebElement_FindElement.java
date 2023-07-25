package seleniumLectures;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class D_WebElement_FindElement {

	public static void main(String[] args) throws InterruptedException {
		
		ChromeOptions chromeOptions = new ChromeOptions();
		  //  chromeOptions.addArguments("--start-maximized");
		    chromeOptions.addArguments("--remote-allow-origins=*");
		  //  return new ChromeDriver(chromeOptions);
		
		WebDriverManager.chromedriver().setup();
		 WebDriver driver = new ChromeDriver(chromeOptions);
	
	

		
		
		String url = "https://toptechschool.dailydebuggers.tech/";
		
		driver.get(url);
		
		driver.manage().window().maximize();
		System.out.println("********maximizing the window********");

		 driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(20));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		String title = driver.getTitle();
		System.out.println("********getting the page title********" +  title );
		
		
		//WebElement registerBttn =driver.findElement(By.xpath("//*[@id=\"navbar-collapse-header\"]/div/a[2]"));
		//registerBttn.click();
		
		WebElement MyAccount = driver.findElement(By.xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[2]"));
		MyAccount.click();
		
		WebElement login = driver.findElement(By.xpath("//a[text()='Login']"));
		login.click();
		
	WebElement EnterEmail = driver.findElement(By.xpath("//input[@id='input-email']"));
	EnterEmail.sendKeys("sadatsayedibrahim@gmail.com");
	
	WebElement EnterPassword = driver.findElement(By.xpath("//input[@id='input-password']"));
	EnterPassword.sendKeys("test123");
	
	WebElement SignBttn = driver.findElement(By.xpath("//input[@id='signinbtn']"));
	SignBttn.click();
	Thread.sleep(3000);
	WebElement logout = driver.findElement(By.xpath("//div/a[text()='logout']"));
	logout.click();
	
	driver.close();
	
	/*
	 * 
	 * WebElement shop =
	 * driver.findElement(By.xpath("(//a[@class='list-group-item'])[3]"));
	 * Thread.sleep(3000); shop.click(); System.out.println("clicking shop button");
	 * Thread.sleep(3000);
	 * 
	 * WebElement AddToCart = driver.findElement(By.
	 * xpath("(//span[@class='hidden-xs hidden-sm hidden-md'])[6]"));
	 * Thread.sleep(3000); System.out.println("adding to cart"); AddToCart.click();
	 * Thread.sleep(3000);
	 * 
	 * driver.close();
	 */
	
	/*
	WebElement cameras = driver.findElement(By.xpath("(//a[@class='dropdown-toggle'])[2]"));
	Thread.sleep(4000);
	Actions action = new Actions(driver);
	action.moveToElement(cameras).click();
	Thread.sleep(3000);
	WebElement item = driver.findElement(By.xpath("//*[@id=\"menu\"]/div[2]/ul/li[1]/div/div/ul/li[4]/a"));
	Thread.sleep(3000);
	action.moveToElement(item).click();
	
	
	
	 * WebElement AddToCart
	 * =driver.findElement(By.xpath("//div/button[@onclick='addtocart(2966628,1)']")
	 * ); Thread.sleep(3000); AddToCart.click(); Thread.sleep(3000); WebElement
	 * MyAccountlink =driver.findElement(By.xpath("(//a[text()='My Account'])[2]"));
	 * action.click(MyAccountlink); Thread.sleep(3000); WebElement logOut =
	 * driver.findElement(By.xpath("//a[text()='logout']"));
	 * 
	 * Thread.sleep(3000); logOut.click(); Thread.sleep(3000); String exPageTitle1
	 * =driver.getTitle(); System.out.println(exPageTitle1);
	 */
	
	}

}
