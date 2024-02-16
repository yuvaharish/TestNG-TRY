package execuationpack;

import org.testng.annotations.Test;

public class DependeciesManagement {
	
	@Test(enabled = true)
	public void highSchool() {
		System.out.println("highSchool");
	}
	@Test(dependsOnMethods = "highSchool")
	public void higherSecondarySchool() {
		System.out.println("higherSecondarySchool");
	}

	@Test(dependsOnMethods = "higherSecondarySchool")
	public void engineering() {
		System.out.println("Engineering");
	}
	
}
