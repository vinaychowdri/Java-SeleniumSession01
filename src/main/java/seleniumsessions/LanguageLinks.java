package seleniumsessions;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LanguageLinks {
	static WebDriver driver;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

				
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.google.co.in/");
		By locators=By.xpath("//div[@id='SIvCob']/a");
		clickOnLink(locators, "हिन्दी");
//		By footer=By.xpath("//ul[@class='footer-nav']/li");
//		clickOnLink(footer, "Careeers");
	}
	
	public static void clickOnLink(By locator,String linktext) {
		List<WebElement> langList=driver.findElements(locator);
		System.out.println(langList.size());
		for(WebElement e:langList) {
			String text=e.getText();
			System.out.println(text);
			if(text.contains(linktext)) {
				e.click();
				break;
			}
		}
	}

}
