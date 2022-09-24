package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class getValueAttribute {

	static WebDriver driver;

	public static void main(String[] args) {
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		By emaid=By.id("input-email");
		doSendKeys(emaid, "vinay@gmail.com");
//		String text=doGetText(emaid);
//		System.out.println(text);
////		 
//		String str=driver.findElement(emaid).getAttribute("value");
//		System.out.println(str);
//		
//		String para=driver.findElement(By.xpath("//*[@id=\"content\"]/div/div[1]/div/div/p[2]")).getText();
//		System.out.println(para);
		
		System.out.println(doGetAttribute(emaid, "value"));
		
		
	}
	
	public static String doGetAttribute(By locator,String attriname) {
		return getElement(locator).getAttribute(attriname);
	}
	public static String doGetText(By locator) {
		return getElement(locator).getText();
	}
	public static void doSendKeys(By locator,String value) {
		getElement(locator).sendKeys(value);
	}

	
	public static void doClick(By locator) {
		getElement(locator).click();
	}
	public static WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

}
