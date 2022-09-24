package rahulshettyseleniumsession;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class e2etest {

	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		String name="vinay";
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		driver.findElement(By.xpath("//button[text()='Reset Login']")).click();
		
		String passwordtext=driver.findElement(By.xpath("//p[@class='infoMsg']")).getText();
		//Please use temporary password 'rahulshettyacademy' to Login
		String[] passwordarray=passwordtext.split("'");
		String newpassword=passwordarray[1].split("'")[0];
		System.out.println(newpassword);
		driver.findElement(By.xpath("//button[@class='go-to-login-btn']")).click();
		driver.findElement(By.id("inputUsername")).sendKeys(name);
		driver.findElement(By.name("inputPassword")).sendKeys(newpassword);
		driver.findElement(By.xpath("//button[@type='submit']")).click();
	
	//	Assert.assertEquals(driver.findElement(By.cssSelector("h2")).getText(),
		

	}

	
}
