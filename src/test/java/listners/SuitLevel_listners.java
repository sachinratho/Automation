package listners;

import org.junit.Assert;
import org.testng.annotations.Test;

public class SuitLevel_listners {
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
