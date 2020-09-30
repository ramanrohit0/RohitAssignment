package stepslogin;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Steps {
	WebDriver driver;
		
	@Given("The login application should be launched")
	public void the_login_application_should_be_launched() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "C://Users//RohitRaman//Downloads//chromedriver_win32//chromedriver.exe");
	driver = new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://elearningm1.upskills.in/");
	Thread.sleep(5000);
	    
	}

	@When("I click on Sign Up")
	public void i_click_on_sign_up() {
		driver.findElement(By.xpath("//*[@href='http://elearningm1.upskills.in/main/auth/inscription.php']")).click();;
	    
	}
	@When("I enter the First name as {string}")
	public void i_enter_the_first_name_as(String string) {
		driver.findElement(By.id("registration_firstname")).sendKeys("Rohit");
	    
	}
	@When("I enter the Last name as {string}")
	public void i_enter_the_last_name_as(String string) {
		driver.findElement(By.id("registration_lastname")).sendKeys("Raman");
	    
	}
	@When("I enter the e-mail as {string}")
	public void i_enter_the_e_mail_as(String string) {
		driver.findElement(By.id("registration_email")).sendKeys("ramanrohit@abc.com");
	    
	}
	@When("I enter the User as {string}")
	public void i_enter_the_user_as(String string) {
		driver.findElement(By.id("username")).sendKeys("ramanrohit");
	    
	}
	@When("I enter the Pass as {string}")
	public void i_enter_the_pass_as(String string) {
		driver.findElement(By.id("pass1")).sendKeys("abc@123");
	 
	}
	@When("I enter the Confirm password as {string}")
	public void i_enter_the_confirm_password_as(String string) {
		driver.findElement(By.id("pass2")).sendKeys("abc@123");
	    
	}
	@When("I click on Register")
	public void i_click_on_register() {
		driver.findElement(By.id("registration_submit")).click();
	    
	}	
	@When("I enter the username as {string}")
	public void i_enter_the_username_as(String string) {
		driver.findElement(By.id("login")).sendKeys("ramanrohit");
	    
	}
	@When("I enter the password as {string}")
	public void i_enter_the_password_as(String string) throws InterruptedException {
		driver.findElement(By.id("password")).sendKeys("abc@123");
		Thread.sleep(2000);
	    
	}
	@When("I click on Login button")
	public void i_click_on_login_button() throws InterruptedException {
		driver.findElement(By.id("form-login_submitAuth")).click();
		Thread.sleep(3000);
	    
	}
	
	@Then("I validate the User register successfully")
	public void i_validate_the_user_register_successfully() {
		driver.getPageSource().contains("Dear Rohit Raman");
		System.out.println("Text is Present");
	    
	}
	
	@Then("I validate the Email")
	public void i_validate_the_email() {
		driver.findElement(By.className("img-circle")).click();
		driver.getPageSource().contains("ramanrohit@abc.com");
		System.out.println("Validated Email is present");
	    
	}

	@Then("I compose and send email")
	public void i_compose_and_send_email() throws InterruptedException {
		driver.findElement(By.xpath("//*[@href='http://elearningm1.upskills.in/main/messages/new_message.php']")).click();
		Thread.sleep(5000);
		driver.findElement(By.className("select2-search__field")).sendKeys("TestRohit");
		Thread.sleep(3000);
		driver.findElement(By.className("select2-search__field")).sendKeys(Keys.ENTER);
		driver.findElement(By.id("compose_message_title")).sendKeys("This is test");
		Thread.sleep(3000);
		WebElement element = driver.findElement(By.xpath("//iframe[@title='Rich Text Editor, content']"));
		driver.switchTo().frame(element);
		WebElement compose = driver.findElement(By.xpath("//body[@class='cke_editable cke_editable_themed cke_contents_ltr cke_show_borders']"));
		compose.sendKeys("This is for testing purpose");
		driver.switchTo().parentFrame();
		driver.findElement(By.id("compose_message_compose")).click();
	    
	}
	



}
