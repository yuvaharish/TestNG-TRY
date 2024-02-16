package execuationpack;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterizationExa {
	WebDriver driver;
	
	@Parameters("Borwser")
	@Test
	public void browserOpen( String browserName) {
		
		switch (browserName) {
		
		case "chrome":
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://mvnrepository.com/");
			break;
		case "firefox":
			driver = new FirefoxDriver();
			driver.manage().window().maximize();
			driver.get("https://www.amazon.in/");
			break;
		case "edge":
			driver = new EdgeDriver();
			driver.manage().window().maximize();
			driver.get("https://mvnrepository.com/");
		default:
			System.out.println("default");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.get("https://mvnrepository.com/");
			break;
		}
		
		
		
		
		
	}

}
