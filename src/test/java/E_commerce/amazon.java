package E_commerce;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Reporter;
import org.testng.annotations.Test;

public class amazon {
  @Test
  public void amazontest() {
	  Reporter.log("opening amazon",true);
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.amazon.in");
	  driver.quit();
  }
}
