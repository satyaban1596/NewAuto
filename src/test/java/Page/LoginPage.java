package Page;

import org.openqa.selenium.By;

import Helper.Base;


public class LoginPage extends Base{
	//satyaban mahunta
	public By username=By.xpath("//input[@id='user-name']");
	public By password=By.xpath("//input[@id='password']");
	public By login=By.xpath("//input[@id='login-button']");
	
	public void user_give_and_as_credential(String Username, String Password) {
		//setup();
		Wait(username).sendKeys(Username);
		Wait(password).sendKeys(Password);
		
	}
	
	public void hit_the_login_button() {
	    Wait(login).click();
	}

	public void verify_successful_login() {
	   
	}

}
