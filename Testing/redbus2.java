
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class redbus2 {
public static void main(String[] args) throws InterruptedException {
	WebDriver driver = new ChromeDriver();
	 
	   driver.get("https://www.redbus.in/");
       
       WebElement Account = driver.findElement(By.xpath("(//DIV[@class='rb_main_secondary_item  link'])[2]"));
       WebElement Details = driver.findElement(By.id("ticket_details"));
       
     		  
       Actions actions = new Actions(driver);



       actions.moveToElement(Account).click().perform(); 
       Thread.sleep(2000);
       actions.moveToElement(Details).perform();
       Thread.sleep(2000);
       actions.click(Details).perform();
       
}
}