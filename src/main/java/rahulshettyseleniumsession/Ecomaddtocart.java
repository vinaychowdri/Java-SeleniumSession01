package rahulshettyseleniumsession;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Ecomaddtocart {

	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		String[] itemsNeeded = { "Cucumber", "Beetroot","Brocolli" ,"Banana"};
		driver.get("https://rahulshettyacademy.com/seleniumPractise/");
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
