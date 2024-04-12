

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

class LoginC {

    @Test
    void testLogin() {
        // Initialize WebDriver
        WebDriver driver = new FirefoxDriver();

        try {
            // Open the login page
            driver.get("http://localhost:4200/auth");
            
            // Enter email and password
            WebElement emailInput = driver.findElement(By.id("username"));
            emailInput.sendKeys("keshav09khandelwal@gmail.com");
            
            WebElement passwordInput = driver.findElement(By.id("password"));
            passwordInput.sendKeys("@flysky123");
            
            // Click the login button
            WebElement loginButton = driver.findElement(By.id("loginButton"));
            loginButton.click();

            // Add sleep to pause execution
            Thread.sleep(2000); // 2 seconds (adjust as needed)

            // Add assertions or further actions if needed
            // For example, you can verify if the login was successful by checking for elements on the next page
            // or by verifying the URL
        } catch (Exception e) {
            e.printStackTrace();
            fail("An exception occurred: " + e.getMessage());
        } finally {
            // Close the WebDriver instance
            driver.quit();
        }
    }

}