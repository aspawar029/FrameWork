package keyword_driven_framework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.safari.SafariDriver;
import io.github.bonigarcia.wdm.WebDriverManager;

public class keyword {

	private static WebDriver driver;

	public static void openBrowser(String browserName) {

		/**
		 * This keyword is used for opening browsers Only the listed browsers
		 * are able to open. "Chrome" "Safari" "IE" "Firefox" Author : Amol
		 * Pawar
		 **/

		switch (browserName) {
		case "Chrome":

			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;

		case "Safari":

			driver = new SafariDriver();
			break;

		case "IE":

			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;

		case "firefox":

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		default:

			System.out.println("Check the browser list and run test case.");
		}

	}
	
	public static void manageBrowser() {
		
		driver.manage().window().maximize();

	}

	public static void openUrl(String url) {

		driver.get(url);

	}

	public static void clickOnElement(String elementName) {

		driver.findElement(By.xpath("//*[contains{text(), '" + elementName + "'}]")).click();

	}

			/**
			 *   Below keyword used to find the element or click the respective element with different locator strategy
			 * @param locatorType 
			 * @param locatorValue
			 * This keyword finds elements using 
			 * XPATH
			 * ID
			 * NAME
			 * CSSSelector
			 * 
			 * Author -AmolPawar
			 */
		
	public static void clickOnElement(String locatorType, String locatorValue) {
		
		switch(locatorType){
		
		case "XPATH" :
		
		driver.findElement(By.xpath(locatorValue)).click();
		
		case "ID":
			driver.findElement(By.id(locatorValue)).click();
			
		case "NAME" :
		
			driver.findElement(By.name(locatorValue)).click();
		
		case "CSSSelector":
			
			driver.findElement(By.cssSelector(locatorValue)).click();
		}

	}
	


	public static void closeBrowser() {

		driver.close();

	}

}
