
@SelectHotel
Feature: Validating Select Hotel Page

 
  Scenario Outline: Verifying Select Hotel page with valid Credentials 
    Given User Should be in the AdactIn Home 
    When User login with "<username>" and "<password>" and click on login 
		Then User should login succesfull
    When User should Search Hotels "<Location>","<Hotels>","<RoomType>","<NumberOfRooms>","<CheckInDate>","<CheckOutDate>","<AdultsPerRoom>","<ChildernPerRoom>"
		And  Verify success message after searching hotels
		When User Should select corresponding hotel and Click on Continue
		Then User should be able to move to the Book a hotel page
		
		

 

   
      
Examples: 
    	| username   |  password   |Location | Hotels| RoomType| NumberOfRooms| CheckInDate  | CheckOutDate | AdultsPerRoom | ChildernPerRoom|
      | Rachana123 | Adactin@123 | London  |Hotel Sunshine|Double|2|12/01/2022|15/01/2022|2|1|