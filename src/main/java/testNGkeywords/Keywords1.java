package testNGkeywords;

import org.testng.annotations.Test;

public class Keywords1 {
	@Test
	public void mno() {
		System.out.println(" mno is printed");
	}
	@Test 
public void Abc() {                                              //def,mno,abc,pqr,xyz
	System.out.println(" Abc is printed");	
	}
	@Test (priority=4)
public void xyz() {
	System.out.println(" xyz is printed");
	
}
	@Test (priority=2)
public void pqr() {
	System.out.println(" pqr is printed");
}
	@Test (priority=0)
public void def() {
	System.out.println(" def is printed");
}




}
