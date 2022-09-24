package seleniumsessions;

import java.util.HashMap;
import java.util.Map;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


import io.github.bonigarcia.wdm.WebDriverManager;

public class AmazonTest {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		/*
		 * WebDriverManager.edgedriver().setup(); WebDriver driver=new EdgeDriver();
		 */
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.amazon.com/");
		
		Thread.sleep(5000);
		System.out.println("gggggggggggggggggggg");
		
		
	}


}
