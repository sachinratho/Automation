package testNG_Grooping;

import org.testng.annotations.Test;

public class Group1 {
	@Test (groups= {"sanity"})
	public void test21() {
		System.out.println("test21 is running ");
	}
	@Test(groups= {"sanity","smoke"})
	public void test22() {
		System.out.println("test22 is running ");
	}
	@Test(groups= {"sanity","regression"})
	public void test23() {
		System.out.println("test23 is running ");
	}
	@Test(groups= {"regression","smoke"})
	public void test24() {
		System.out.println("test24 is running ");
	}
	@Test(groups= {"regression"})
	public void test25() {
		System.out.println("test25 is running ");
	}





}
