package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TotalLinks {
	static WebDriver driver;

	public static void main(String[] args) {

		// WAP
		// 1.total links
		// 2.print the text of each link (ignore the blank/empty text)
		// 3.print the href value of the link
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get("https://www.amazon.com");
		List<WebElement> listlinks = driver.findElements(By.tagName("a"));
		System.out.println(listlinks.size());

//		int c=0;
//		for (WebElement e : listlinks) {
//			String textname = e.getText();
//			if (!textname.isEmpty()) {
//				System.out.println(c+":"+textname);
//			}
//			String href=e.getAttribute("href");
//			System.out.println(href);
//
//		}
//		c++;
//		
		
//		for(int i=0;i<listlinks.size();i++) {
//			String text=listlinks.get(i).getText();
//			if (!text.isEmpty()) {
//				System.out.println(i+":"+text);
//			}
//			String href=listlinks.get(i).getAttribute("href");
//			System.out.println(href);
//		}
		By links=By.tagName("a");
		By imgs=By.tagName("img");
		System.out.println(getElementCount(links));
		System.out.println(getElementCount(imgs));

		if(getElementTextList(links).contains("Registry")) {
			System.out.println("Registry is Present");
		}
		System.out.println(getElementsAttributeList(imgs,"src"));
	}
	
	public static List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public static int getElementCount(By locator) {
		return getElements(locator).size();
	}
	
	public static void printElementText(By locator) {
		List<WebElement> eleList=getElements(locator);
		for(WebElement e:eleList) {
			String text=e.getText();
			System.out.println(text);
		}
	}
	/**
	 * this method will return the list of element's text
	 * @param locator
	 * @return
	 */

	public static List<String> getElementTextList(By locator) {
		List<WebElement> eleList=getElements(locator);
		List<String> eleTextList=new ArrayList<String>();
		
		for(WebElement e:eleList) {
			String text=e.getText();
			if(!text.isEmpty()) {
				eleTextList.add(text);
			}
		}
		return eleTextList;
	}
	
	/**
	 * this method will return the list of element's attribute value
	 * @param locator
	 * @param attrName
	 * @return
	 */
	public static List<String> getElementsAttributeList(By locator,String attrName) {
		List<WebElement> eleList=getElements(locator);
		List<String> eleAttrList=new ArrayList<String>();
		for(WebElement e:eleList) {
			String attrVal=e.getAttribute(attrName);
			eleAttrList.add(attrVal);
		}
		return eleAttrList;
	}
	
}
