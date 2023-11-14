package org.stepDef;

import org.BaseClass.BaseClass;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.*;

public class TC_1_Login_StepDef extends BaseClass{
	
	@Given("User Should Successfully navigate to AdactInHotel URL")
	public void user_should_successfully_navigate_to_adact_in_hotel_url() {
	
		browserLaunch("https://adactinhotelapp.com/");
	
	}

	@When("User Should enter valid Username & Password")
	public void user_should_enter_valid_username_password() {
	
		findElementWithId("username").sendKeys("Rachana123");
		
		
		findElementWithName("password").sendKeys("Adactin@123");
	}

	@When("User Should Click the login button")
	public void user_should_click_the_login_button() {
	
		findElementWithId("login").click();
	}

	@Then("User Should be login successfully")
	public void user_should_be_login_successfully() {
		
//		WebElement element = findElementWithXpath("//input[@value='Hello rachana123!']");
//		String text = element.getText();
//		
//		if(text.equals("Hello rachana123!")) {
//			System.out.println("Successfully logedin");
//		}
//		return text;
	}




}
