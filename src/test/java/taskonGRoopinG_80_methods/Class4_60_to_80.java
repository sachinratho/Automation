package taskonGRoopinG_80_methods;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Class4_60_to_80 {
	@Test
	public void test61() {
		System.out.println(" test61 is running");
	}
	

	@Test (groups = {"mechanical" })
	public void test62() {
		System.out.println(" test63 is running");
	}
	@Test (groups = {"mechanical" })
	public void test63() {
		System.out.println(" test63 is running");
	}
	@Test (groups = {"civil" })
	public void test64() {
		System.out.println(" test64 is running");
	}
	@Test (groups = {"civil" , " mechanical"})
	public void test65() {
		System.out.println(" test65 is running");
	}
	@Test (groups = {"extc" })
	public void test66() {
		System.out.println(" test66 is running");
	}
	@Test  (groups = {"extc" , " civil" })
	public void test67() {
		System.out.println(" test67 is running");
		
	}
	@Test (groups = {"mechanical" })
	public void test68() {
		System.out.println(" test68 is running");
	
	}
	@Test
	public void test69() {
		System.out.println(" test69 is running");
		
	}
	@Test (groups = {"computer" })
	public void test70() {
		System.out.println(" test70 is running");
	}
	@Test (groups = {"computer" , "mechanical"})
	public void test71() {
		System.out.println(" test71 is running");
		//Assert.fail();
	}
	@Test (groups = {"b-teck" })
	public void test72() {
		System.out.println(" test72 is running");
	}
	@Test (groups = {"m-teck" })
	public void test73() {
		System.out.println(" test73 is running");
	//	Assert.fail();
	}
	@Test (groups = {"mechanical ", "chemical" })
	public void test74() {
		System.out.println(" test74 is running");
		//Assert.fail();
	}
	@Test (groups = {"mechanical" , "civil" })
	public void test75() {
		System.out.println(" test75 is running");
		//Assert.fail();
	}
	@Test
	public void test76() {
		System.out.println(" test76 is running");
		//Assert.fail();
	}
	@Test (groups = {"extc" , "computer" })
	public void test77() {
		System.out.println(" test77 is running");
	//	Assert.fail();
	}
	@Test
	public void test78() {
		System.out.println(" test78 is running");
	}
	
	@Test (groups = {"COMPUTER" })
	public void test79() {
		System.out.println(" test79 is running");
	//	Assert.fail();
	}

}
