

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class School {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		WebDriver driver = new FirefoxDriver();

	        // Navigating to the specified URL
	        driver.get("https://schooledn.py.gov.in/admission/hsc.html");

	        // Creating an Actions object for performing mouse actions
	        Actions actions = new Actions(driver);

	        // Locating the "Schools" link on the webpage
	        WebElement school = driver.findElement(By.xpath("//A[@href='#'][text()='Schools']/self::A"));

	        // Locating the "Government" link on the webpage
	        WebElement govt = driver.findElement(By.xpath("//A[@href='#'][text()='Government']/self::A"));

	        // Locating the "State Govt" link on the webpage
	        WebElement state = driver.findElement(By.xpath("//A[@href='../schools/stateGovt.html'][text()='State Govt']/self::A"));

	        // Clicking on the "Schools" link
	        actions.click(school).perform();

	        // Moving to the "Government" link and clicking
	        actions.moveToElement(govt).click().perform();

//	        actions.click(govt).perform(); // This line is commented out as it is not used

	        // Moving to the "State Govt" link
	        actions.moveToElement(state).perform();

	        // Clicking on the "State Govt" link
	        actions.click(state).perform();

	}

}