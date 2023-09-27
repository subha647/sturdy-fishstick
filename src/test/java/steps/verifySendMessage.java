package steps;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import Element_Repo.helper_element;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class verifySendMessage {
	WebDriver driver;
	String username;
	String message_to_send;
	String btn_string;
	String askquestion = "Ask a Question";
	String email;
	String password;
	String position;
	helper_element he;
	
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_BLUE = "\u001B[34m";
	
	
	
	
	public verifySendMessage(commonSteps common_step) {
		
		this.driver = common_step.getDriver();
		this.username = "unknown";
		this.message_to_send = "hi, I am Subha, like to have a discussion regarding the openings";
		this.email = "Subhakanta8154@gmail.com";
		this.password = "Automation@123";
		this.position = "Marketing Manager"; // Already tested with "Marketing Manager", test a different position e.g. QA
		this.he = new helper_element(this.driver);
		
	}
	
	@Given("I am on landing page")
	public void i_am_on_landing_page() throws InterruptedException {
		driver.get("https://basecopy5.staging.pg-test.com/v2/");
	}
	
	@When("I click on Sign in Button")
	public void i_click_on_sign_in_button() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10) );
		he.signinButton.click();
	}


	@Then("I passed email address")
	public void i_passed_email_address() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10) );
		he.emailInput.sendKeys(email);
	}

	@Then("I passed Password")
	public void i_passed_password() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10) );
		he.passwordInput.sendKeys(password);
	    
	}

	@Then("Click Login Button")
	public void click_login_button() throws InterruptedException {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10) );
		he.loginBtn.click();
		
	}
	
	@Then("Navigate to homepage")
	public void navigate_to_homepage() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10) );
		he.homeNav.click();
	}

	@Then("navigate to jobs page")
	public void navigate_to_jobs_page() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10) );
		Actions act = new Actions(driver);
		
		WebElement career = he.careerDropdown;

		act.moveToElement(career).build().perform();
				
		he.jobTab.click();
		
	}
	
	@Then("Click on the QA job")
	public void click_on_the_qa_job() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10) );
		driver.findElement(By.xpath("//div[text()='"+position+"']")).click();
			
		
	}
	
	@Then("Click on ask question")
	public void click_on_ask_question() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10) );
		username = he.secondUserName.getText();
		
		WebElement btn_msg_user = he.askButton;
		btn_string = btn_msg_user.getText();
		
		if (btn_string.equals(askquestion)) {
			btn_msg_user.click();
		}
		else {
			System.out.println(ANSI_BLUE+"Conversation already started...."+ANSI_RESET);
		}
			
		
	}
	
	@Then("Pass the message to user")
	public void pass_the_message_to_user() {
		if (btn_string.equals(askquestion)) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10) );
			
			he.msgInputBox.clear();
			WebElement msg = he.msgInput;
			msg.clear();
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10) );
			msg.sendKeys(message_to_send);						
		}
		else {
			System.out.println(ANSI_BLUE+"No need to pass message...."+ANSI_RESET);
		}
		
	}
	
	@Then("Press the send button")
	public void press_the_send_button() {
		if (btn_string.equals(askquestion)) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10) );
			he.sendmsgBtn.click();
		}
		else {
			System.out.println(ANSI_BLUE+"No need to send new message...."+ANSI_RESET);
		}
		
	
		
		
	}
	
	@Then("Open Inbox")
	public void open_inbox() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10) );
		he.inpoxNav.click();
		
	}
	
	@Then("search for the user")
	public void search_for_the_user() {
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10) );
//		he.secondUser.click();
		driver.findElement(By.xpath("//div[text()='"+username+"']")).click();
		
	}
	
	@Then("search for the text")
	public void search_for_the_text() {
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10) );
		WebElement send_msg = he.userMsg;
		String message_in_inbox = send_msg.getText();
		if (message_to_send.equals(message_in_inbox)) {
			System.out.println(ANSI_BLUE+"Message send by the user is found in inbox..."+ANSI_RESET);
		}
		else {
			System.out.println("user send:"+ANSI_YELLOW+message_to_send+ANSI_RESET);
			System.out.println("found in inbox:"+ANSI_YELLOW+message_in_inbox+ANSI_RESET);
			System.out.println(ANSI_YELLOW+"Message send by the user is different in inbox..."+ANSI_RESET);
			throw new AssertionError(ANSI_RED+"Message send by the user is different !"+ANSI_RESET);
			
		}
		
	}
	
	
	
	
	
	
}
