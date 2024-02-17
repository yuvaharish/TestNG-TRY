package execuationpack;

import org.testng.Assert;
import org.testng.annotations.Test;

import failedRerun.Retry;

public class Test1 {
	
	@Test(groups = {"sanity"})
	public void fitstTestCase() {
		//Assert.assertFalse(true);
		System.out.println("this is my first sanity");
	}
	
	@Test(groups = {"smoke"})
	public void SecondTestCase() {
		
		System.out.println("this is my second smoke");
	}
	
	@Test(groups = {"regerisson"})
	public void thirdTestCase() {
		System.out.println("this is my third regerisson");
	}

	
}
