package execuationpack;

import org.testng.annotations.Test;

public class GroupExample {
	
	@Test(groups = {"smoke"})
	public void one() {
		System.out.println("smoke one");
	}
	
	@Test(groups = {"sanity"})
	public void two() {
		System.out.println("sanity one");
	}
	
	@Test(groups = {"regerisson"})
	public void three() {
		System.out.println("regerisson One");
	}

}
