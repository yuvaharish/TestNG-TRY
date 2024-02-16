package execuationpack;

import org.testng.annotations.Test;

public class PriorityEx {
	
	@Test(priority=0)
	public void startTheCar() {
		System.out.println("Start the Car");
	}
	@Test(priority = 1)
	public void firstGear() {
		System.out.println("firstGear");
	}
	@Test(priority = 2)
	public void secondGear() {
		System.out.println("secondGear");
	}
	@Test(priority = 3)
	public void thirdGear() {
		System.out.println("Third gear");
	}
	
	@Test(priority = 4,enabled = false)
	public void music() {
		System.out.println("trun on music");
	}
	
}
