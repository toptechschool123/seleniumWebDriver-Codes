package seleniumLectures;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class utils {


	public static void scrolPageDownwithJS (WebDriver driver) {
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeAsyncScript("window.scrollTo(0,document.body.scrollHeight,arg1)");
	}
	
	public static void clickElementwithJS(WebElement element, WebDriver driver) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeAsyncScript("arguments[0].click",element);
}
	
	public static void sendKeysWithJS(WebDriver driver, String element, String value) {
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("document.getElementById(‘" + element + "').value = '" + value+ "'" );
				
	} 
	
	public static void selectCalendarDatewithJS(WebDriver driver, String date, WebElement element) {
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		js.executeScript("argmuments[0].setAttribute('value','" + date + "'); ", element);

}}

