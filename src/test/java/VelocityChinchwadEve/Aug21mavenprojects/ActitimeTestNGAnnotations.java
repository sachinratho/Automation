package VelocityChinchwadEve.Aug21mavenprojects;

import org.testng.annotations.Test;

import actitimepfMaven.ActitimeHomepageMaven;
import actitimepfMaven.ActitimeLOGINpageMaven;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;

public class ActitimeTestNGAnnotations {
	WebDriver driver;
	ActitimeHomepageMaven hp;
	ActitimeLOGINpageMaven lp;
	
	
	
	
	
  @Test
  public void verifyactimepagelogo() {
	  System.out.println(" started checking logo ");
	  hp.verifyactimepagelogo();
	  System.out.println(" logo verified and logo verified ");
 
	  
  }
  @BeforeMethod
  public void beforeMethod() {
	  System.out.println(" login aplication");
	  lp.setActitimeloginpageusername();
	  lp.setActitimeloginpagepassword();
	  lp.setActitimeloginpageloginbutton();
  }

  @AfterMethod
  public void afterMethod() {
	 hp.actimepagelogoutbutton();
	 System.out.println("logout successfully");
 }

  @BeforeClass
  public void openbrowser() {
	  System.out.println(" open browser");
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\setup\\chromedriver94_seleniumfile\\chromedriver.exe");
	     driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		
		driver.navigate().to("http://localhost/login.do");	
		
		
		 lp = new ActitimeLOGINpageMaven(driver);

		 hp= new ActitimeHomepageMaven(driver);
		
  }

  @AfterClass
  public void afterClass() {
	  System.out.println(" closed browser");
	  driver.close();
  }

}
