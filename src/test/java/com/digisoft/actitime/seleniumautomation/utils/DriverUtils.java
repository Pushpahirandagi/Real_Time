package com.digisoft.actitime.seleniumautomation.utils;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import java.time.Duration;

public class DriverUtils extends GlobalVariables {
	
	/***
	 * @author PUSHPA
	 * @param type - pass 0 or 1 argument, and the 1 argument is either
	 *             ff, chrome,edge only
	 * @return
	 */
	public WebDriver getDriver(String... type)// method overloading //flexible to argument //many number of argument
	{
		System.out.println("Creating a driver");
		if (type.length == 0) {
			System.out.println("Since no option is given, creating chrome by default");
			driver = new ChromeDriver();

		} else {
			switch (type[0]) {
			case "fire":
				driver = new FirefoxDriver();
				break;
			case "chrome":
				driver = new ChromeDriver();
				break;
			case "edge":
				driver = new EdgeDriver();
				break;
			default:
				System.out.println("Invalid Browser");
				break;
			}
		}
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		System.out.println("Driver object is created successfully");
		return driver;
	}
	/***
	 * get element is a reusable function which returns valid web elements if it is matches the type and value and it returns the null
	 * @param type-id,name, x-path, css,class,tag,linktext,partiallinktext
	 * @param value 
	 * @return valid web element
	 * @author PUSHPA
	 */

	// Method to get WebElement based on type and value
	public WebElement getElement(String type, String value) { 
		System.out.println("Finding the element using WebElement");
		WebElement element = null;
		switch (type.toLowerCase()) {
		case "id":
			element = driver.findElement(By.id(value));
			 break;
		case "name":
			element = driver.findElement(By.name(value));
			 break;
		case "xpath":
			 element =  driver.findElement(By.xpath(value));
			 break;
		case "css":
			element = driver.findElement(By.cssSelector(value));
			 break;
		case "class":
			element = driver.findElement(By.className(value));
			break;
		case "tag":
			element = driver.findElement(By.tagName(value));
			break;
		case "linktext":
			element = driver.findElement(By.linkText(value));
			break;
		case "partiallinktext":
			element = driver.findElement(By.partialLinkText(value));
			break;
		default:
			//throw new IllegalArgumentException("Invalid locator type: " + type);
			System.out.println("Invalid locator type: " + type);
			break;
		}
		
		return  element;
	}
	
	/***
	 *  get element is a reusable function which returns valid list of web elements if it is matches the type and value and it returns the null
	 * @param type-id,name, x-path, css,class,tag,linktext,partiallinktext
	 * @param value 
	 * @return valid list of web element
	 * @author PUSHPA
	 */
	// Method to get WebElements based on String type and value
	public List<WebElement> getElements(String type, String value)
	{
		System.out.println("Finding the element using WebElements");
		List<WebElement> elements = null;
		
		switch (type.toLowerCase()) {
		case "id":
			elements = driver.findElements(By.id(value));
			 break;
		case "name":
			elements = driver.findElements(By.name(value));
			 break;
		case "xpath":
			elements = driver.findElements(By.xpath(value));
			 break;
		case "css":
			elements =  driver.findElements(By.cssSelector(value));
			 break;
		case "class":
			elements = driver.findElements(By.className(value));
			break;
		case "tag":
			elements = driver.findElements(By.tagName(value));
			break;
		case "linktext":
			elements = driver.findElements(By.linkText(value));
			break;
		case "partiallinktext":
			elements = driver.findElements(By.partialLinkText(value));
			break;
		default:
			//throw new IllegalArgumentException("Invalid locator type: " + type);
			System.out.println("Invalid locator type: " + type);
			break;
		}
		return elements;
	}
	
	/***
	 * type is a reusable function which can be used to perform type operation on the text 
	 * @param type-id,name, x-path, css,class,tag,linktext,partiallinktext
	 * @param value 
	 * @author PUSHPA
	 */
	// Method definition with return type void, taking three String parameters
	public void type(String type, String value, String text) {
		System.out.println("Entering " + text + " on a WEb Element with property " + type + " : " + value);
		getElement(type, value).sendKeys(text);
		//driver.findElement(By.type('value'))
	}
	/***
	 * click is a reusable function which can be used to perform click operation on the textbox
	 * @param type-id,name, x-path, css,class,tag,linktext,partiallinktext
	 * @param value 
	 * @author PUSHPA
	 */

	// Method to perform a click action based on type and value of the locator
	public void click(String type, String value) {
		System.out.println("Clicking on the Web Element with property " + type + " : " + value);
		WebElement element = getElement(type, value);
		element.click(); // Click the located element
	}
	/***
	 * get element text is a reusable function which returns valid text of web elements if it is matches the type and value and it returns the text
	 * @param type-id,name, x-path, css,class,tag,linktext,partiallinktext
	 * @param value 
	 * @return valid text of web element
	 * @author PUSHPA
	 */

	
	// Method to get the text of an element based on the type and value
	public String getElementText(String type, String value) {
		WebElement element = getElement(type, value);
		String text =  element.getText();
		
		System.out.println("Text on the Element is " + text);
		return text;
	}
	/***
	 * get element attribute is a reusable function which returns valid attribute web elements if it is matches the type and value and it returns the null
	 * @param type-id,name, x-path, css,class,tag,linktext,partiallinktext
	 * @param value 
	 * @return valid web element
	 * @author PUSHPA
	 */

	// Method to return the attribute of an element based on the type of locator and
	// attribute
	public String getElementAttribute(String type, String value, String attribute) {
		WebElement element = getElement(type, value);
		
		// Return the requested attribute from the element
		if (element != null) {
			return element.getAttribute(attribute);
		} 
		else {
			return null;
		}
	}
}


