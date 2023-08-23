package E_commerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class Snapdeal {
  @Test
  public void snapdealTest() {
	  Reporter.log("opening sd",true);
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.snapdeal.com");
	  driver.quit();
  }
}
