package selenium.jenkinstest2;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class TestClass {
	WebDriver driver = null;
	  @BeforeClass
	  public void beforeClass() {
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
	  }
	  
	  @Test
	  public void testCase1() {
		  driver.get("https://www.facebook.com/");
		  List<WebElement> elements = driver.findElements(By.xpath("//a"));
		  System.out.println(elements.size());
		  elements.stream().forEach(e->System.out.println(e.getAttribute("href")));
	  }
	  @AfterClass
	  public void afterClass() {
		  driver.quit();
	  }
}
