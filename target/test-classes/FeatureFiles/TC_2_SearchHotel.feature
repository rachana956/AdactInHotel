
@SearchHotel
Feature: Verifying AdactInHotel Search page
  
Scenario Outline: Validating Search page 
    Given User Should be in the AdactIn Home page
    When User login with "<username>" and "<password>" and click on login
		Then User should login succesfully
    When User should Search Hotel "<Location>","<Hotels>","<RoomType>","<NumberOfRooms>","<CheckInDate>","<CheckOutDate>","<AdultsPerRoom>","<ChildernPerRoom>"
		And  Verify success message after search hotels
 

    Examples: 
    	| username   |  password   |Location | Hotels| RoomType| NumberOfRooms| CheckInDate  | CheckOutDate | AdultsPerRoom | ChildernPerRoom|
      | Rachana123 | Adactin@123 | London  |Hotel Sunshine|Double|2|12/01/2022|15/01/2022|2|1|
      
      
