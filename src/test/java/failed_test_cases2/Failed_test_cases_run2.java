package failed_test_cases2;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Failed_test_cases_run2 {
	@Test
	public void mno() {
		System.out.println(" mno is printed");
		Assert.fail();
	}
	@Test 
public void Abc() {                                       
	System.out.println(" Abc is printed");	
	Assert.fail();
	}
	@Test
public void xyz() {
	System.out.println(" xyz is printed");
	
}
	@Test 
public void pqr() {
	System.out.println(" pqr is printed");
}
	@Test 
public void def() {
	System.out.println(" def is printed");
}


}
