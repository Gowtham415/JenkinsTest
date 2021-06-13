package selenium.jenkinstest2;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestClass2 {
	WebDriver driver = null;

	@BeforeClass
  public void beforeClass() throws Exception {	  
	  
	  String browserName = System.getProperty("browser.name");
	  
	  if(browserName.equalsIgnoreCase("chrome")) {
		  WebDriverManager.chromedriver().setup();
		  driver = new ChromeDriver();
	  }else if(browserName.equalsIgnoreCase("firefox")) {
		  WebDriverManager.firefoxdriver().setup();
		  driver = new FirefoxDriver();
	  }
	 
  }

	@Test
	public void testMethod() {
		driver.get("https://www.apple.com/in/?cid-oas-in-domains-apple.in/");
		driver.manage().window().maximize();
		List<WebElement> elements = driver.findElements(By.xpath("//a"));
		System.out.println(elements.size());
		elements.stream().forEach(e -> System.out.println(e.getAttribute("href")));

	}

	@AfterClass
	public void afterClass() {
		driver.quit();
	}

}
