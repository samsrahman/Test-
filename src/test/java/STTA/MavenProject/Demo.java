package STTA.MavenProject;

import org.junit.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
//import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Demo {
 WebDriver driver;
 


  @Test 
  public void verifySearch() {
		 System.setProperty("webdriver.gecko.driver", "D:\\New folder\\geckodriver.exe");
		   driver = new FirefoxDriver();
	 
	 
 
	 
   driver.get("http://only-testing-blog.blogspot.in/");
   driver.quit();
  }
}