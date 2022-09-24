package seleniumsessions;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ElementUtil {

	private WebDriver driver;

	public ElementUtil(WebDriver driver) {
		this.driver = driver;
	}

	public By getBy(String locatorType, String locatorValue) {
		By locator = null;
		switch (locatorType.toLowerCase()) {
		case "id":
			locator = By.id(locatorValue);
			break;
		case "name":
			locator = By.name(locatorValue);
			break;
		case "classname":
			locator = By.className(locatorValue);
			break;
		case "xpath":
			locator = By.xpath(locatorValue);
			break;
		case "css":
			locator = By.cssSelector(locatorValue);
			break;
		case "linktext":
			locator = By.linkText(locatorValue);
			break;
		case "partiallinktext":
			locator = By.partialLinkText(locatorValue);
			break;
		case "tagname":
			locator = By.tagName(locatorValue);
			break;
		default:
			break;
		}
		return locator;
	}

	public WebElement getElement(By locator) {
		return driver.findElement(locator);
	}

	public void doClick(By locator) {
		getElement(locator).click();
	}

	public void doClick(String locatorType, String locatorValue) {
		getElement(getBy(locatorType, locatorValue)).click();
	}

	public void doSendKeys(By locator, String value) {
		getElement(locator).sendKeys(value);
	}

	public void doSendKeys(String locatorType, String locatorValue, String value) {
		getElement(getBy(locatorType, locatorValue)).sendKeys(value);
	}

	public String doGetText(By locator) {
		return getElement(locator).getText();
	}

	public String doGetAttribute(By locator, String attriname) {
		return getElement(locator).getAttribute(attriname);
	}

	public boolean doIsDisplayed(By locator) {
		return getElement(locator).isDisplayed();
	}
	public  List<WebElement> getElements(By locator) {
		return driver.findElements(locator);
	}
	
	public  int getElementCount(By locator) {
		return getElements(locator).size();
	}
	
	public  void printElementText(By locator) {
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

	public  List<String> getElementTextList(By locator) {
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
	public  List<String> getElementsAttributeList(By locator,String attrName) {
		List<WebElement> eleList=getElements(locator);
		List<String> eleAttrList=new ArrayList<String>();
		for(WebElement e:eleList) {
			String attrVal=e.getAttribute(attrName);
			eleAttrList.add(attrVal);
		}
		return eleAttrList;
	}
	
	/**
	 * this method is used to click on text on particular links
	 * @param locator
	 * @param linktext
	 */
	public void clickOnLink(By locator,String linktext) {
		List<WebElement> langList=getElements(locator);
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
