package rahulshettyseleniumsession;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class window {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		
		/*
		 * driver.get("https://rahulshettyacademy.com/loginpagePractise/#");
		 * 
		 * driver.findElement(By.cssSelector(".blinkingText")).click();
		 * 
		 * Set<String> windows = driver.getWindowHandles();
		 * //[parentid,childid,subchildId]
		 * 
		 * Iterator<String>it = windows.iterator();
		 * 
		 * String parentId = it.next();
		 * 
		 * String childId = it.next();
		 * 
		 * driver.switchTo().window(childId);
		 * 
		 * System.out.println(driver.findElement(By.cssSelector(".im-para.red")).getText
		 * ());
		 * 
		 * driver.findElement(By.cssSelector(".im-para.red")).getText();
		 * 
		 * String emailId=
		 * driver.findElement(By.cssSelector(".im-para.red")).getText().split("at")[1].
		 * trim().split(" ")[0];
		 * 
		 * driver.switchTo().window(parentId);
		 * 
		 * driver.findElement(By.id("username")).sendKeys(emailId);
		 */
		driver.get("https://the-internet.herokuapp.com/windows");
		
		driver.findElement(By.xpath("//a[contains(text(),'Click Here')]")).click();
		 Set<String> windows = driver.getWindowHandles();
		 //[parentid,childid,subchildId]
		
		 Iterator<String>it = windows.iterator(); 
		String parentId = it.next();

		  String childId = it.next();
		 driver.switchTo().window(childId);
		 String childwindowvalue=driver.findElement(By.cssSelector("h3")).getText();
		 System.out.println(childwindowvalue);
		 driver.switchTo().window(parentId);
		 String parentwindowvalue=driver.findElement(By.cssSelector("h3")).getText();
		 System.out.println(parentwindowvalue);
		 
	}

}
