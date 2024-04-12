
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumTesting {
    public static void main(String[] args) {
        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            // Navigate to the provided webpage
            driver.get("https://www.calculator.net/");

            // ID Locator
            WebElement searchBarById = driver.findElement(By.id("calcSearchTerm"));

            // Class Name Locator
            WebElement homeListDivByClassName = driver.findElement(By.className("homelisttile"));

            // Name Locator (Not used in the provided HTML)

            // Tag Name Locator
            WebElement bodyTag = driver.findElement(By.tagName("body"));

            // Link Text Locator
            WebElement aboutUsLinkByLinkText = driver.findElement(By.linkText("about us"));

            // Partial Link Text Locator (Not used in the provided HTML)

            // CSS Selector Locator (Not used in the provided HTML)

            // XPath Locator
            WebElement privacyPolicyLinkByXPath = driver.findElement(By.xpath("//a[contains(text(),'privacy policy')]"));

            // Print some information about the elements found
            System.out.println("Search bar found by ID: " + searchBarById.getAttribute("name"));
            System.out.println("Home list div found by Class Name: " + homeListDivByClassName.getText());
            System.out.println("Body tag found by Tag Name: " + bodyTag.getTagName());
            System.out.println("About Us link found by Link Text: " + aboutUsLinkByLinkText.getAttribute("href"));
            System.out.println("Privacy Policy link found by XPath: " + privacyPolicyLinkByXPath.getAttribute("href"));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}

