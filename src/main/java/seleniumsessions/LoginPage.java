package seleniumsessions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		BrowserUtil br= new BrowserUtil();
		WebDriver driver=br.launchBrowser("chrome");
		driver.get("https://demo.opencart.com/index.php?route=account/login");
		System.out.println(driver.getTitle());
		
		By emailId=By.id("input-email");
		By password=By.id("input-password");
		ElementUtil el=new ElementUtil(driver);
		el.doSendKeys(emailId, "vinay@gmail.com");
		el.doSendKeys(password, "password1");
		
		driver.close();
	}

}
