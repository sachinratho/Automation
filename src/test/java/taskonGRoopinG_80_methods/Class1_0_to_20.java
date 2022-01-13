package taskonGRoopinG_80_methods;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Class1_0_to_20 {
	@Test (groups = {"regression" })
	public void one() {
		System.out.println(" one is running");
	}
	

	@Test  (groups = {"SMOKE" })
	public void two() {
		System.out.println(" two is running");
	}
	@Test
	public void three() {
		System.out.println(" three is running");
	}
	@Test (groups = {"sanity" })
	public void four() {
		System.out.println(" four is running");
	}
	@Test  (groups = {"sanity" , "smoke"})
	public void five() {
		System.out.println(" five is running");
		//Assert.fail();
	}
	@Test  (groups = {"regression" , "S and F testing"})
	public void six() {
		System.out.println(" six is running");
		//Assert.fail();
	}
	@Test  (groups = {"BBT" , "UAT"})
	public void seven() {
		System.out.println(" seven is running");
		//Assert.fail();
		
	}
	@Test  (groups = {"sanity" , "BBT"})
	public void eight() {
		System.out.println(" eight is running");
		//Assert.fail();
		
	}
	@Test  (groups = {"BBT" , "WBT"})
	public void nine() {
		System.out.println(" nine is running");
		//Assert.fail();
	
	}
	@Test  (groups = {"regression" , "UAT"})
	public void ten() {
		System.out.println(" one is running");
	}
	@Test(groups = {"UAT"})
	public void eleven() {
		System.out.println(" eleven is running");
		//Assert.fail();

	}
	@Test(groups = {"regression"})
	public void twelve() {
		System.out.println(" twelve is running");
		//Assert.fail();
	}
	@Test (groups = {"sanity"})
	public void thirtyne() {
		System.out.println(" thirtyne is running");
		//Assert.fail();
		
	}
	@Test (groups = {"BBT"})
	public void fourtyne() {
		System.out.println(" fourtyne is running");
	}
	@Test(groups = {"WBT"})
	public void fiftyne() {
		System.out.println(" fiftyne is running");
		
	}
	@Test (groups = {" retesting"})
	public void sisteen() {
		System.out.println(" sixteen is running");
	}
	@Test(groups = {" smoke"})
	public void seventyne() {
		System.out.println(" seventyne is running");

	}
	@Test (groups = {" sanity" , "smoke"})
	public void nineteen() {
		System.out.println(" nineteen is running");
	}
	
	@Test  (groups = {" sanity" , "regression"})
	public void twenty() {
		System.out.println(" twenty is running");
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
