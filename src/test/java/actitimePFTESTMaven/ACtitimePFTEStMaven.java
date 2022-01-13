package actitimePFTESTMaven;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import actitimepfMaven.ActitimeHomepageMaven;
import actitimepfMaven.ActitimeLOGINpageMaven;
import actitimepfMaven.ActitimeUserPage;

public class ACtitimePFTEStMaven {

public  static void main (String [] args) {
	
	System.setProperty("webdriver.chrome.driver", "D:\\selenium\\setup\\chromedriver94_seleniumfile\\chromedriver.exe");
    WebDriver driver= new ChromeDriver();
	driver.manage().deleteAllCookies();
	
	driver.manage().window().maximize();
	driver.navigate().to("http://localhost/login.do");	
	driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
	WebDriverWait wait = new WebDriverWait(driver, 5);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(""))
	
	ActitimeLOGINpageMaven act= new ActitimeLOGINpageMaven(driver);
	act.setActitimeloginpageusername();
	act.setActitimeloginpagepassword();
	act.setActitimeloginpageloginbutton();
	ActitimeUserPage user = new ActitimeUserPage(driver);
	user.clickonuser();
	user.clickonuserplus();
	user.sendkeys();
	user.sendkeys1();
	//driver.close();
//	System.out.println(" closed successfully");
	
	ActitimeHomepageMaven act1= new ActitimeHomepageMaven(driver);
	act1.verifyactimepagelogo();
	//act1.clickonuser();
//	//act1.clickonuserplus();
//	act1.actimepagelogoutbutton();
     driver.close();	
	System.out.println("scenario is passed");
//}
}}
