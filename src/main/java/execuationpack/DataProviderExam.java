package execuationpack;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import basePack.Base_Class;

public class DataProviderExam extends Base_Class {
	
	String[][] data={{"Admin","admin1"},
					{"Adm","admin123"},
					{"Admi","admin12"},
					{"Admin","admin123"}};
	
	@DataProvider(name="loginda")
	public String[][] loginData() {
		
		return data;
	}
	
	@BeforeSuite
	public void openChrome() {
		browserLaunch();
		Url("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	}
	
	@Test(dataProvider = "loginda")
	public void orngHRM(String userName,String passWord) {

		WebElement user = driver.findElement(By.name("username"));
		typeText(user, userName);
		WebElement pass = driver.findElement(By.name("password"));
		typeText(pass, passWord);
		WebElement login = driver.findElement(By.xpath("//*[@type='submit']"));
		elementClick(login);
	}

}
