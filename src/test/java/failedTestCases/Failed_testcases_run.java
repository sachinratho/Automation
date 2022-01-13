package failedTestCases;

import org.junit.Assert;
import org.testng.annotations.Test;

public class Failed_testcases_run {
	@Test
public void test21() {
System.out.println(" test21 is running")	;
}
	@Test
public void test22() {
System.out.println(" test22 is running")	;
Assert.fail();
}
	@Test
public void test23() {
System.out.println(" test23 is running")	;
Assert.fail();
}
	@Test
public void test24() {
System.out.println(" test24 is running")	;
}
	@Test
public void test25() {
System.out.println(" test25 is running")	;
}
}
