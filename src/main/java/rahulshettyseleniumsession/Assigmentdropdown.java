package rahulshettyseleniumsession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Assigmentdropdown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://rahulshettyacademy.com/angularpractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.name("name")).sendKeys("Vinay");
		driver.findElement(By.name("email")).sendKeys("vinaychowdri48@gmail.com");
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("test123");
		driver.findElement(By.id("exampleCheck1")).click();
		WebElement staticdropdown=driver.findElement(By.id("exampleFormControlSelect1"));
		Select dropdown=new Select(staticdropdown);
		dropdown.selectByVisibleText("Male");
		driver.findElement(By.id("inlineRadio1")).click();
		driver.findElement(By.name("bday")).click();
		driver.findElement(By.name("bday")).sendKeys("14-03-1993");
		
		driver.findElement(By.xpath("//input[@class='btn btn-success']")).click();
		
		String sucessmessage=driver.findElement(By.xpath("//div[@class='alert alert-success alert-dismissible']")).getText();
		System.out.println(sucessmessage);
		

	}

}
