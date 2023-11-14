package org.stepDef;

import static org.junit.Assert.assertTrue;

import org.BaseClass.BaseClass;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.*;

public class TC_2_SearchHotelStepDef extends BaseClass{
	
	@Given("User Should be in the AdactIn Home page")
	public void user_should_be_in_the_adact_in_home_page() {
		browserLaunch("https://adactinhotelapp.com/");
	}

	@When("User login with {string} and {string}")
	public void user_login_with_and(String username, String password) {
		
		findElementWithId("username").sendKeys(username);
		findElementWithId("password").sendKeys(password);
		
		findElementWithId("login").click();
	}

	@Then("User should login succesfully")
	public static void user_should_login_succesfully() {
		
		
		
		WebElement element = findElementWithXpath("//input[@value='Hello rachana123!']");
		
		String text = element.getText();
		
		assertTrue(text.equals("Hello rachana123!"));
	
	}

	@When("User should Search Hotel {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_should_search_hotel(String Location, String Hotels, String RoomType, String NumberOfRooms, String CheckInDate, String CheckOutDate,String AdultsPerRoom,String ChildernPerRoom) {
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

	@When("Verify success message after search hotels")
	public void verify_success_message_after_search_hotels() {
		
		
	}




}
