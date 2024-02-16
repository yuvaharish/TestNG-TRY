package execuationpack;

import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import basePack.Base_Class;

public class BrowserTest extends Base_Class {

	@BeforeSuite
	public void first() {
		browserLaunch();
	}
	
	
	@Test
	public void flipkart() {
		//Assert.assertFalse(true);
		Url("https://www.amazon.in/");
	}
	
	@Test
	public void snapDeal() {
		Url("https://www.snapdeal.com/");
	}
	@AfterSuite
	public void after() {
		driver.close();
	}
}
