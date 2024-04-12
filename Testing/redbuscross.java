


import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class redbuscross {

	public static void main(String[] args) throws InterruptedException {
		// Initialize WebDriver
        WebDriver driver = new ChromeDriver();
		//Actions actions = new Actions(driver);
		driver.get("https://www.redbus.com/");
		driver.manage().window().maximize();
		driver.findElement(By.linkText("Help")).click();
		Thread.sleep(3000);
		Set<String> alw= driver.getWindowHandles();
		Iterator<String> it = alw.iterator();
		String pw = it.next();
		String cw= it.next();
		driver.switchTo().window(cw);
		driver.findElement(By.xpath("//i[@class='icon-close']")).click();

	}

}