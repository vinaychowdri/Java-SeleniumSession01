package seleniumsessions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class QuitVsClose {
	
	public static void main(String args[]) {
		
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com");
		
		String PageTitle=driver.getTitle();
		if (PageTitle.equalsIgnoreCase("Google")) {
			System.out.println("title is same");
			
		}else {
			System.out.println("title is not");
		}
		
		
		
		//quit means close the browser server will not showdown
		//btn client and server interaction will be stopped 
		
		//driver.quit();//nosuchSessionException
		//session id is null .using webdriver after calling quite
		
		driver.close();//nosuchSessionException: invalid session id
		//session id will  same its will be invalid after that
		//server will not close for both after close browser 
		
		System.out.println(driver.getTitle());
		
	}

}
