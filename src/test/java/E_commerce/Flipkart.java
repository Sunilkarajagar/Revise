package E_commerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Flipkart {
  @Test
  public void FlipkartTest() {
	  Reporter.log("opening Flipkart",true);
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.flipkart.com");
	  driver.quit();
  }
}
