package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalImages {

	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// WAP:
		//1.total images
		//2. print the src
		//3. print the alt
		
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.amazon.com");
		List<WebElement> imgelist=driver.findElements(By.tagName("img"));
		System.out.println("total images:"+imgelist.size());
		
		for(WebElement e:imgelist) {
			String altvalue=e.getAttribute("alt");
			String srcvalue=e.getAttribute("src");
			System.out.println(altvalue +":"+srcvalue);
		}
		
	}

}
