package stepDefinitions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import junit.framework.Assert;
import page.AddContact;
import page.HomePage;
import page.LoginPage;
import util.BrowserFactory;

public class StepDefinition {
	
	WebDriver driver= BrowserFactory.startBrowser("chrome", "http://techfios.com/test/billing/?ng=login/");
	
	@Given("^user is already in Login Page$")
	public void user_is_already_in_Login_Page() throws Throwable {
		
		String actualTitle=driver.getTitle();	
		System.out.println(actualTitle);
		String expectedTitle="Login - TechFios Test Application - Billing";
		Assert.assertEquals(expectedTitle, actualTitle);
	    
	}

	@When("^user enters \"([^\"]*)\" and \"([^\"]*)\"$")
	public void user_enters_and(String username, String password) throws Throwable {
		
		LoginPage logintechfios=PageFactory.initElements(driver, LoginPage.class);
		logintechfios.Login(username, password);	
	    
	}

	@Then("^After login close the browser$")
	public void after_login_close_the_browser() throws Throwable {
	    
		driver.close();
		driver.quit();	
	
	}
	

@Then("^user will navigate to CRM and click Add Contact$")
public void user_will_navigate_to_CRM_and_click_Add_Contact() throws Throwable {
	
HomePage home= PageFactory.initElements(driver, HomePage.class);
	
home.NavigateToAddContact();

   
}

@Then("^user should fill up the form, and click submit$")
public void user_should_fill_up_the_form_and_click_submit() throws Throwable {
	
	
	AddContact contact=PageFactory.initElements(driver, AddContact.class);
	
	contact.FillingUpAdressForm("John", "Nokia", "John@gmail.com", "3474307205", "3317 finley drive", "dallas", "Texas", "75062");

    
}


}
