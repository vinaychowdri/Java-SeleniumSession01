package rahulshettyseleniumsession;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Checkboc {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
	driver.get("https://rahulshettyacademy.com/AutomationPractice/");
	//1. check the first checkbox and verify if it is succesfully checked and uncheck it again to verify if it is succesfully unchecked
	
	driver.findElement(By.id("checkBoxOption1")).click();
	Thread.sleep(2000);
	Assert.assertTrue(driver.findElement(By.id("checkBoxOption1")).isSelected(),"verify if it is succesfully checked");
	Thread.sleep(2000);
	driver.findElement(By.id("checkBoxOption1")).click();
	Thread.sleep(2000);
	Assert.assertFalse(driver.findElement(By.id("checkBoxOption1")).isSelected(), "verify if it is succesfully unchecked");
	
	//2.how to get the count of check boxes prsesent in the page
	int count =driver.findElements(By.xpath("//input[@type='checkbox']")).size();
	System.out.println(count);
	
	}

}
