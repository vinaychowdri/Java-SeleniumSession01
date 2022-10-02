package rahulshettyseleniumsession;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ecomaddtocart {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		//impicitlywait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		String[] itemsNeeded = { "Cucumber", "Beetroot","Brocolli" ,"Banana"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
		
		addaItems(driver,itemsNeeded);
		driver.findElement(By.xpath("//img[@alt='Cart']")).click();
		driver.findElement(By.xpath("//button[contains(text(),'PROCEED TO CHECKOUT')]")).click();
		driver.findElement(By.cssSelector(".promoCode")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("button.promoBtn")).click();
		//explictwait
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("span[class='promoInfo']")));
		String promocode=driver.findElement(By.cssSelector("span[class='promoInfo']")).getText();
		System.out.println(promocode);
	}
	
	public static void addaItems(WebDriver driver,String[] itemsNeeded) {
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i = 0; i < products.size(); i++) {
			String name = products.get(i).getText().split("-")[0].trim();
			System.out.println(name);
			// check whether name you extracted is present in array or not
			// convert array into array list for easy search
			List itemsNeededList = Arrays.asList(itemsNeeded);
			int j=0;
			
			if (itemsNeededList.contains(name)) {

				// click on add to cart
				j++;
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				if(j==itemsNeeded.length)
				{
					break;
				}

			}

		}
	}

}
