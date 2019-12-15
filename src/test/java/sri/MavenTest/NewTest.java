package sri.MavenTest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.AfterTest;

public class NewTest {
	
	public static WebDriver driver = null;
	public static String driver_key="webdriver.chrome.driver";
	public static String driver_value="C:\\Users\\sudv\\eclipse-workspace\\ThirdPartyTools\\Driver\\chromedriver.exe";
	
	  @BeforeTest
	  public void beforeTest() {
		  System.setProperty(driver_key, driver_value);
		  driver= new ChromeDriver();
		  
	  }
	
  @Test
  public void launchBrowser() {
	  driver.get("https://www.edureka.co/");
	  String title= driver.getTitle();
	  Assert.assertTrue(title.contains("Instructor"));
	
  }


  @AfterTest
  public void afterTest() {
	  driver.close();
  }

}
