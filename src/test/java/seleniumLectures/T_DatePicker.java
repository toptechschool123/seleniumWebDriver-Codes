package seleniumLectures;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class T_DatePicker {

	public static void main(String[] args) throws InterruptedException  {

		WebDriver driver = new ChromeDriver();

		driver.get("http://www.phptravels.net/");
		
		// driver.manage().window().fullscreen();
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(60));
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		String month = "March 2023";
		String day = "19";
		
		
		
		WebElement checkin = driver.findElement(By.id("checkin"));
		checkin.click();
		Thread.sleep(2000);
		
		
		while(true) {
			String text= 	driver.findElement(By.xpath("/html/body/div[8]/div[1]/table")).getText();
			if (text.equals(month)) {
				break;
			}
			else
			{ 
				driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[8]/div[1]/table/thead/tr[1]/th[3]/i")).click();
			}
		WebElement click = 	driver.findElement(By.xpath("//*[@id=\"fadein\"]/div[8]/div[1]/table/tbody/tr[4]/td[1]"));
		Thread.sleep(2000);
		click.click();
		Thread.sleep(2000);
		}
		
			
		
		}
}
	
	//	driver.close();
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		/*
		
		  driver.navigate().to("https://www.redbus.in//"); 
		  
	
		String year = "2023";
		String month = "July";
		String date = "20";
		
		driver.findElement(By.id("onward_cal")).click();
		
	while (true)
	{
		String monthyear = driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[2]")).getText();
		String arr [] = monthyear.split(" " );
		
		String mon =arr[0];
		String yr= arr[1];
		
		if (mon.equalsIgnoreCase(month)&& yr.equalsIgnoreCase(year))
			break;
		
		else
		driver.findElement(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table/tbody/tr[1]/td[3]/button")).click();
		
		}
		
	List<WebElement> alldates = driver.findElements(By.xpath("//*[@id=\"rb-calendar_onward_cal\"]/table//tbody"));
	 for(WebElement ele:alldates)
	 {
		 String dt=ele.getText();
		 if(dt.equals(date))
		 {
			 ele.click();
			 break;
			 
		 }
	 }
	*/
	


