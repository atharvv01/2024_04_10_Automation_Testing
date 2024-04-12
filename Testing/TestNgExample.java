


import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;

public class TestNgExample {
  @Test
  @BeforeMethod
  public void beforeMethod() {
    System.out.println("Before Test");
  }

  @AfterMethod
  public void afterMethod() {
    System.out.println("After Test");
  }

  @Test
  public void testAddition() {
    int expectedResult = 8;
    int actualResult = Calculator.add(3, 5);
    System.out.println("Result of addition: " + actualResult);
    Assert.assertEquals(actualResult, expectedResult, "Addition result is incorrect");
  }
  
  @Test
  public void testSubtraction() {
    int expectedResult = 6;
    int actualResult = Calculator.subtract(10, 4);
    System.out.println("Result of subtraction: " + actualResult);
    Assert.assertEquals(actualResult, expectedResult, "Subtraction result is incorrect");
  }

}

class Calculator {
  
  public static int add(int a, int b) {
    return a + b;
  }
  
  public static int subtract(int a, int b) {
    return a - b;
  }

}