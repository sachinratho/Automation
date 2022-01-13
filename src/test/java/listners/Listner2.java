package listners;


import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

@Listeners(listners.ClassLevel_listners.class)
 class Listner2  {
	 
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

