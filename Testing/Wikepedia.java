import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Wikepedia {
    public static void main(String[] args) {
        // Initialize the WebDriver
        WebDriver driver = new ChromeDriver();

        try {
            driver.get("https://www.wikipedia.org/");

            // ID Locator
            WebElement searchBarById = driver.findElement(By.id("searchInput"));

            
            // Tag Name Locator
            WebElement bodyTag = driver.findElement(By.tagName("body"));
            WebElement projectTitle = driver.findElement(By.className("other-project-title"));
            WebElement Language = driver.findElement(By.className("central-featured-lang"));
            
            WebElement heading = driver.findElement(By.className("lang-list-button-text"));

            // Link Text Locator (Not used in the provided HTML)

            // Partial Link Text Locator (Not used in the provided HTML)

            // CSS Selector Locator (Not used in the provided HTML)

            // XPath Locator
            WebElement privacyPolicyLinkByXPath = driver.findElement(By.xpath("//a[contains(text(),'Privacy')]"));

            // Print some information about the elements found
            System.out.println("Search bar found by ID: " + searchBarById.getAttribute("name"));
            System.out.println("Body tag found by Tag Name: " + bodyTag.getTagName());
            System.out.println("Privacy Policy link found by XPath: " + privacyPolicyLinkByXPath.getAttribute("href"));
            System.out.println("Text : " + projectTitle.getText());
            System.out.println("Heading : " + heading.getText());
            System.out.println("Language: " + Language.getText());
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // Close the browser
            driver.quit();
        }
    }
}
