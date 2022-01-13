package testNGkeywords;

import org.testng.annotations.Test;

public class Keyword3 {
	
	@Test
	public void mno() {
		System.out.println(" mno is printed");//def,mno,Abc+4,pqr,xyz
	}
	@Test (priority=1,invocationCount=5)//def,mno,Abc+4,pqr
public void Abc() {                                       
	System.out.println(" Abc is printed");	
	}
	@Test (priority=4,enabled=false)
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
