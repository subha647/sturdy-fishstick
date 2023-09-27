package Element_Repo;

import org.junit.validator.PublicClassValidator;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class helper_element {
	
	WebDriver driver;
	
	
	@FindBy(xpath="//button[@class='ant-btn sign_in_btn__fmPfd']") public WebElement signinButton;
	@FindBy(xpath="//input[@id='email']") public WebElement emailInput;
	@FindBy(xpath="//input[@id='password']") public WebElement passwordInput;
	@FindBy(xpath="//button[@form='auth-standard-login-form']") public WebElement loginBtn;
	@FindBy(xpath="//button[text()='Home']") public WebElement homeNav;
	@FindBy(xpath="//button[@aria-label='Career']") public WebElement careerDropdown;
	@FindBy(xpath="//li[@id='tab-option-1']") public WebElement jobTab;
	@FindBy(xpath="//div[text()='QA']") public WebElement companyCard;
	@FindBy(xpath="//span[@class='nameText__usyVY']") public WebElement secondUserName;
	@FindBy(xpath="//button[@class='Button-module_root__XAZ4E Button-module_default__k4a0- Button-module_primary__4ciLr cta__XUl3v']") public WebElement askButton;
	@FindBy(xpath="//div[@class='fr-element fr-view']") public WebElement msgInputBox;
	@FindBy(xpath="//div[@class='fr-element fr-view']//p") public WebElement msgInput;
	@FindBy(xpath="//button[@class='Button-module_root__XAZ4E Button-module_default__k4a0- Button-module_primary__4ciLr']") public WebElement sendmsgBtn;
	@FindBy(xpath="//button[@aria-label=\"Inbox\"]") public WebElement inpoxNav;
	@FindBy(xpath="//div[text()='']") public WebElement secondUser;
	@FindBy(xpath="//div[@class='rich-text ql-editor']") public WebElement userMsg;
	
	public helper_element(WebDriver driver){
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	

}
