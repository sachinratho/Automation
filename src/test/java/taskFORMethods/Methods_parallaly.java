package taskFORMethods;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Methods_parallaly {
String 	Expttl="Facebook – log in or sign up";

	@Test
	public void test1() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\setup\\chromedriver94_seleniumfile\\chromedriver.exe");

		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.navigate().to("https://www.facebook.com/");
		
		String ACTUALttl = d.getTitle();
	
		if(ACTUALttl==Expttl) {
			System.out.println("actual tittle ="+ACTUALttl);
		}else {
			System.out.println("url is not matched with eachother");
		}
		
		
		d.close();
		System.out.println("first method executed sucessfully");
	}
	@Test
	public void test2() {
		System.setProperty("webdriver.chrome.driver", "D:\\selenium\\setup\\chromedriver94_seleniumfile\\chromedriver.exe");
		WebDriver d = new ChromeDriver();
		d.manage().window().maximize();
		d.manage().deleteAllCookies();
		d.navigate().to("https://www.facebook.com/");
		d.close();
		System.out.println("second method executed sucessfully");

	}


}
