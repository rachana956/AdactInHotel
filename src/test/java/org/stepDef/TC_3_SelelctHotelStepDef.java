package org.stepDef;




import org.BaseClass.BaseClass;

import org.junit.*;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;



public class TC_3_SelelctHotelStepDef extends BaseClass{

	@Given("User Should be in the AdactIn Home")
	public void user_should_be_in_the_adact_in_home() {
		browserLaunch("https://adactinhotelapp.com/");
	}

	@When("User login with {string} and {string} and click on login")
	public void user_login_with_and_click_on_login(String username, String password) {
		
		findElementWithId("username").sendKeys(username);
		findElementWithId("password").sendKeys(password);
		
		findElementWithId("login").click();
	}

	@Then("User should login succesfull")
	
	public static void user_should_login_succesfull() {
		
		
		
		WebElement element = findElementWithXpath("//input[@value='Hello rachana123!']");
		
		String text = element.getText();
		
		
		
		
	
	}

	@When("User should Search Hotels {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_should_search_hotels(String Location, String Hotels, String RoomType, String NumberOfRooms, String CheckInDate, String CheckOutDate,String AdultsPerRoom,String ChildernPerRoom) {
		WebElement loc = findElementWithId("location");
		SelectByValue(loc, Location);
		
		WebElement hotels = findElementWithId("hotels");
		SelectByValue(hotels, Hotels);
		
		WebElement type = findElementWithId("room_type");
		SelectByValue(type, RoomType);
		
		WebElement no = findElementWithId("room_nos");
		SelectByValue(no, NumberOfRooms);
		
		WebElement in = findElementWithId("datepick_in");
		in.clear();
		in.sendKeys(CheckInDate);
		
		WebElement out = findElementWithId("datepick_out");
		out.clear();
		out.sendKeys(CheckOutDate);
		
		WebElement adultno = findElementWithId("adult_room");
		SelectByValue(adultno, AdultsPerRoom);
		
		WebElement childernno = findElementWithId("child_room");
		SelectByValue(childernno, ChildernPerRoom);
		
		findElementWithId("Submit").click();
	}

	@When("Verify success message after searching hotels")
	public void verify_success_message_after_searching_hotels() {
		
		
	}
	
	@When("User Should select corresponding hotel and Click on Continue")
	public void user_should_select_corresponding_hotel_and_click_on_continue() {
	
	findElementWithId("radiobutton_0").click();
	findElementWithId("continue").click();
	}

	@Then("User should be able to move to the Book a hotel page")
	public void user_should_be_able_to_move_to_the_book_a_hotel_page() {
	
	
	}
	
	

	
}
