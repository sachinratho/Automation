package actitimepfMaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ActitimeUserPage {
	
	//@FindBy(xpath="//img[@height='93'")
	//@FindBy(xpath="//a[@href=/img/default/pixel.gif?hash=274618146")
	@FindBy(xpath="//a[@href='/administration/userlist.do']")
	private WebElement user;
	@FindBy(xpath="//span[@unselectable='on']")

	private WebElement userplus;
	@FindBy(id="userDataLightBox_firstNameField")
	WebElement entername;
	@FindBy(id="userDataLightBox_usernameField")
	 WebElement entername1;
	
	WebDriver  driver;
	
	// initialization 
	
	public  ActitimeUserPage(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
	//usage
	
//	public ActitimeUserPage(WebDriver driver2) {
		// TODO Auto-generated constructor stub
	//}

	public void clickonuser() {
		user.click();
	}
	public void clickonuserplus() {
		userplus.click();
		
	}
	public void sendkeys() {
		entername.sendKeys("sachin");
	}
	public void sendkeys1() {
		entername1.sendKeys("rathod");
	}


}
