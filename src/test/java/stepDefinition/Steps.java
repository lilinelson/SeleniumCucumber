package stepDefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebDriver;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Steps {

	WebDriver driver;
	
	@Given("^Open the Firefox and launch the application$")
	public void open_the_Firefox_and_launch_the_application() throws Throwable {
		System.out.println("This Step open the Firefox and launch the application.");
		driver = new ChromeDriver();
//		driver.manage().window().maximize();
		driver.get("http://demo.guru99.com/v4/");
		
	}
	@When("^I enter the Username \"([^\"]*)\" and Password \"([^\"]*)\"$")
	public void enter_the_Username_and_Password(String username, String password) throws Throwable {
		System.out.println("This step enters the Username and Password on the login page.");
		driver.findElement(By.name("uid")).sendKeys(username);
		driver.findElement(By.name("password")).sendKeys(password);
	}
	
	@When("^I reset the credential$")
	public void reset_the_credential() throws Throwable {
		System.out.println("This step clicks on the Reset button.");
		driver.findElement(By.name("btnReset")).click();
	}
	
	@Then("^I am on the page \"([^\"]*)\"$")
	public void check_page(String pageName) throws Throwable {
		System.out.printf("This step verifies if the user is on the page: %s%n", pageName);
		driver.quit();
	}
	
}