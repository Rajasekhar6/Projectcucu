package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class SmokeTest {
//Integration with webhooks
	WebDriver driver ;
	
	@Given("^Open firefox and start application$")
	public void open_firefox_and_start_application() throws Throwable {
	   
		System.setProperty("webdriver.chrome.driver","C:\\Personel\\Softwares\\chromedriver_win32\\chromedriver.exe");	
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://trinet.trianz.com");
		
		
	}

	@When("^I enter valid username and valid password$")
	public void i_enter_valid_username_and_valid_password() throws Throwable {
	   
		driver.findElement(By.xpath("//input[@id='_58_login']")).sendKeys("rajasekhar.kakumanu");
		driver.findElement(By.xpath("//input[@id='_58_password']")).sendKeys("Aws*");
			
	}

	@Then("^user should be able to login successfully$")
	public void user_should_be_able_to_login_successfully() throws Throwable {
	   
		driver.findElement(By.xpath("//button[@class='btn  btn-primary']")).click();
			
	}
}
