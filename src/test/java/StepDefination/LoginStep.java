package StepDefination;

import Page.LoginPage;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginStep {
	
	LoginPage log=new LoginPage();
	
	@When("User give {string} And {string} as credential")
	public void user_give_and_as_credential(String Username,String Password) {
	  log.user_give_and_as_credential(Username, Password); 
	}

	@And("Hit the login button")
	public void hit_the_login_button() {
	    log.hit_the_login_button();
	}

	@Then("Verify successful login")
	public void verify_successful_login() {
	    log.verify_successful_login();
	}

}
