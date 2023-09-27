package steps;

import org.openqa.selenium.WebDriver;
//import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.cucumber.java.After;
//import io.cucumber.java.After;
import io.cucumber.java.Before;

public class commonSteps {
	
	private WebDriver driver;

	@Before
	public void setUp() {
	driver=new EdgeDriver();
	driver.manage().window().maximize();
	
	}

	@After
	public void tearDown() throws Exception{
	Thread.sleep(1000);
	driver.quit();

	}
	 
	public WebDriver getDriver() {
	return driver;
	}

}
