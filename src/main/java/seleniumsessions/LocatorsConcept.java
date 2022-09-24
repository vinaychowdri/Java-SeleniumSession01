package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LocatorsConcept {

	static WebDriver driver;
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		WebDriverManager.chromedriver().setup();
		 driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		
		//create a web element
		//WE = by locator
		//Create web element+ action(Click + Sendkeys, isDisplyed......)
		
		
		//1.
		/*
		 * driver.findElement(By.id("input-email")).sendKeys("vinay");
		 * driver.findElement(By.id("input-password")).sendKeys("Test@123");
		 */
		//2.
		/*
		 * WebElement emailid=driver.findElement(By.id("input-email")); WebElement
		 * password=driver.findElement(By.id("input-password"));
		 * emailid.sendKeys("Vinay@gmail.com"); password.sendKeys("input-password");
		 */
		//3.By locator
		/*
		 * By emailid= By.id("input-email"); By password=By.id("input-password");
		 * 
		 * WebElement emailID=driver.findElement(emailid); WebElement
		 * pwd=driver.findElement(password); emailID.sendKeys("vinay@gmail.com");
		 * pwd.sendKeys("password");
		 */
		
		//4.By locator with generic method
		
//		By emailid= By.id("input-email"); 
//		By password=By.id("input-password");
//		
//		getElement(emailid).sendKeys("vinay@gmail.com");
//		getElement(password).sendKeys("password123");
//		
		
//		5.By locator with getElement and actions generic method
//		By emailid= By.id("input-email"); 
//		By password=By.id("input-password");
//		
//		doSendKeys(emailid, "vinay@gmail");
//		doSendKeys(password,"password");
		
		//6.by locator with getElement and actions generic method in util class
//		By emailid= By.id("input-email"); 
//		By password=By.id("input-password");
//		ElementUtil eleutil=new ElementUtil(driver);
//		eleutil.doSendKeys(emailid, "vinay@gmail.com");
//		eleutil.doSendKeys(password, "Test@123");
		
		//7.String locator with By, getElement and actions generic method in util class
//		String eid="input-email";
//		String pwd="input-password";
//		
//		doSendKeys("id", eid, "Vinay@gmail.com");
//		doSendKeys("id", pwd, "Password1");
		
		//8.
		String eid="input-email";
		String pwd="input-password";
		ElementUtil eleutil=new ElementUtil(driver);
		eleutil.doSendKeys("id", eid, "vinay@gmail.com");
		eleutil.doSendKeys("id", pwd, "password1");
	}
	
	public static By getBy(String locatorType,String locatorValue) {
		By locator=null;
		switch (locatorType.toLowerCase()) {
		case "id":
			locator=By.id(locatorValue);		
			break;

		default:
			break;
		}
		return locator;
	}
	
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public static void doSendKeys(By locator,String value) {
		getElement(locator).sendKeys(value);
	}
	
	public static void doSendKeys(String locatorType,String locatorValue,String value ) {
		getElement(getBy(locatorType,locatorValue)).sendKeys(value);
	}
}
