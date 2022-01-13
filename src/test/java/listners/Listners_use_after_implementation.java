package listners;

import static org.testng.Assert.fail;

import org.junit.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

 @Listeners(listners.ClassLevel_listners.class)
 
 
 
 //----------examples taken by my own i am the inventer just to check wheather i have understood or not 
public class Listners_use_after_implementation {
	@Test
	public void test1() {
		Assert.assertNull( "notnull");
		
	}
	@Test
	public void test2() {
		Assert.assertNotNull( "notnull");

}
	@Test (dependsOnMethods="test1")
	public void test3() {
		Assert.assertNull( "notnull");
}
	@Test
	public void test4() {
	Assert.fail();
	

}}