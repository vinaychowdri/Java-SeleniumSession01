package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ElementDisplay {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.id: unique
		//2. name:can be duplicate
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		By emailid=By.id("input-email");
//		
//		if(driver.findElement(emailid).isDisplayed()) {
//			driver.findElement(emailid).sendKeys("Vinay");
//		}
//		
		if(doIsDisplayed(emailid)) {
			doSendKeys(emailid, "vinay@gmail.com");
		}
		
		driver.findElement(emailid).isEnabled();
		//visible--- but disabled --false	
	}
	
	public static String doGetAttribute(By locator,String attriname) {
		return getElement(locator).getAttribute(attriname);
	}
	
	public static boolean doIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}

	public static void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}
}
