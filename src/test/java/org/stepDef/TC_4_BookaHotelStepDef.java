package org.stepDef;

import org.BaseClass.BaseClass;
import org.openqa.selenium.WebElement;

import io.cucumber.java.en.*;

public class TC_4_BookaHotelStepDef extends BaseClass {

	@Given("User should be navigate to Adactinhotel Home page")
	public void user_should_be_navigate_to_adactinhotel_home_page() {

		browserLaunch("https://adactinhotelapp.com/");
	}

	@When("Login with valid {string} and {string}")
	public void login_with_valid_and(String username, String password) {

		findElementWithId("username").sendKeys(username);
		findElementWithId("password").sendKeys(password);

		findElementWithId("login").click();
	}

	@Then("validate user succesful login")
	public void validate_user_succesful_login() {

		WebElement element = findElementWithXpath("//input[@value='Hello rachana123!']");

		String text = element.getText();
	}

	@Then("User should search hotels with {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_should_search_hotels_with(String Location, String Hotels, String RoomType, String NumberOfRooms,
			String CheckInDate, String CheckOutDate, String AdultsPerRoom, String ChildernPerRoom) {

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

	}

	@Then("User should submit the search details")
	public void user_should_submit_the_search_details() {

		findElementWithId("Submit").click();
	}

	@When("User Should select hotel and Click on Continue")
	public void user_should_select_hotel_and_click_on_continue() {
		findElementWithId("radiobutton_0").click();
		findElementWithId("continue").click();
	}

	@Then("User should move to the Book a hotel page")
	public void user_should_move_to_the_book_a_hotel_page() {
	}

	@When("User should give {string},{string},{string},{string},{string},{string},{string},{string}")
	public void user_should_give(String Firstname, String Lastname, String Billingadress, String CreditcardNo,
			String CreditcardType, String SelectMonth, String SelectYear, String CVV) {

		findElementWithId("first_name").sendKeys(Firstname);
		findElementWithId("last_name").sendKeys(Lastname);
		findElementWithId("address").sendKeys(Billingadress);
		findElementWithId("cc_num").sendKeys(CreditcardNo);
		WebElement cctype = findElementWithId("cc_type");
		SelectByValue(cctype, CreditcardType);

		WebElement expmonth = findElementWithId("cc_exp_month");
		SelectByValue(expmonth, SelectMonth);
		WebElement expyear = findElementWithId("cc_exp_year");
		SelectByValue(expyear, SelectYear);

		findElementWithId("cc_cvv").sendKeys(CVV);

	}

	@Then("User should click on BookNow")
	public void user_should_click_on_book_now() {

		findElementWithId("book_now").click();
	}

	@Then("User should get Booking Confirmation")
	public void user_should_get_booking_confirmation() {
	}

}
