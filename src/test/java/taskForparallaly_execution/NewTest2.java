package taskForparallaly_execution;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest2 {
	@Test

	  @BeforeClass
	  public void beforeClass1() {
		  System.setProperty("webdriver.chrome.driver", "D:\\selenium\\setup\\chromedriver94_seleniumfile\\chromedriver.exe");
WebDriver d = new ChromeDriver();
			d.manage().window().maximize();
			d.manage().deleteAllCookies();
			d.navigate().to("https://www.facebook.com/");
	  }

	  @AfterClass
	  public void afterClass1() {
		  System.out.println("closed");
	  }

}
