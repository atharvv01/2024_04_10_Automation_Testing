
import org.openqa.selenium.By;  
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class SubCal {
	
	public static WebElement searchinput(WebDriver driver)
	{
		
		WebElement el = driver.findElement(By.id("calcSearchTerm")); 
		return(el); 
		
	} 
	public static WebElement mortcalc(WebDriver driver)
	{
		
		WebElement el = driver.findElement(By.linkText("Mortgage Calculator")); 
		return(el);
	}

}