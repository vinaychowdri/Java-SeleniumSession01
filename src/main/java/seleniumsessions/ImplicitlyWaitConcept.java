package seleniumsessions;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ImplicitlyWaitConcept {

	public static void main(String[] args) {
		
		//Implicilty wait
		//dynamic wait
		//its only applicable for web Elements:FE FEs
		//not applicable for non web Elements :title,url,alert
		//global wait
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://demo.opencart.com/index.php?route=account/login&language=en-gb");
		
		//10 sec
		WebElement email=driver.findElement(By.id("abc"));
		email.sendKeys("test@gmail.com");
		//10 sec
		WebElement password=driver.findElement(By.id(""));
		

		
	}

}
