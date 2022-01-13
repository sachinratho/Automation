package actitimepfMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeHomepageMaven {

	
	@FindBy(xpath="//img[@height='61']")
	private WebElement	logo;
	
	@FindBy(xpath="//img[@height='93'")
	private WebElement user;
	@FindBy(linkText="/img/default/pixel.gif?hash=274618146")

	private WebElement userplus;
	
	
	@FindBy(className="logout")
	

	private WebElement	logoutbutton;
	
	WebDriver driver;


	//initialization
	 public ActitimeHomepageMaven(WebDriver driver){
		PageFactory.initElements(driver, this);
	}
	//USAGE
	public void verifyactimepagelogo() {
		boolean res = logo.isDisplayed();
		if(res==true) {
			
			System.out.println("logo is displayed");
		}else {
			System.out.println("logo is not displayed");
		}
			
	}
	
	public void clickonuser() {
		user.click();
	}
	public void clickonuserplus() {
	userplus.click();	
	}

	public void actimepagelogoutbutton() {
	logoutbutton.click();
		
	}

}
