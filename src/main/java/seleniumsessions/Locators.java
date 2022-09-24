package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Locators {
	
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//1.id: unique
		//2. name:can be duplicate
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://demo.opencart.com/index.php?route=account/login");
//		driver.findElement(By.name("email")).sendKeys("test@gmail.com");
//		driver.findElement(By.name("password")).sendKeys("password1");
//		
		//3.class name:
//		driver.findElement(By.className("form-control")).sendKeys("mac");
		
		//4.Xpath: is not an attribute
		//address of the element in HTML DOM
		//abs xpath
		//relative xpath
		
//		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("vinay@gmail.com");
//		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("Password123");
//		driver.findElement(By.xpath("//*[@id=\"form-login\"]/button")).click();
//		
//		By email=By.xpath("//*[@id=\\\"input-email\\\"]");
//		By password=By.xpath("//*[@id=\\\"input-password\\\"]");
//		By loginBtn=By.xpath("//*[@id=\\\"form-login\\\"]/button");
//		
//		doSendKeys(email, "vinay@gmail.com");
//		doSendKeys(password, "Password");
//		doClick(loginBtn);
//		
//		5. cssSelector:is not an attribute
		//CSS : Cascaded Style Sheet
//		By email=By.cssSelector("#input-email");
//		By password=By.cssSelector("#input-password");
//		By login=By.cssSelector("#form-login > button");
//		
//		doSendKeys(email, "Vinay@gmail.com");
//		doSendKeys(password, "Password");
//		doClick(login);
//		6. linkText:
//		driver.findElement(By.linkText("Register")).click();
		
//		7.partial linkText
//		driver.findElement(By.partialLinkText("Forgotten")).click();
		
//		8.tagName: html tag
//		String header=driver.findElement(By.tagName("h2")).getText();
//		System.out.println(header);
//		
		By register=By.linkText("Register");
		By header =By.tagName("h2");
		System.out.println(doGetText(register));
		System.out.println(doGetText(header));
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
