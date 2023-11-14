
@BookaHotel
Feature: Validating Book a Hotel page
 

  
  Scenario Outline: Verifying Book a Hotel page 
    Given User should be navigate to Adactinhotel Home page
    When Login with valid "<username>" and "<password>" 
    Then validate user succesful login 
    Then User should search hotels with "<Location>","<Hotels>","<RoomType>","<NumberOfRooms>","<CheckInDate>","<CheckOutDate>","<AdultsPerRoom>","<ChildernPerRoom>"
    And User should submit the search details
    When User Should select hotel and Click on Continue
   	Then User should move to the Book a hotel page
   	When User should give "<Firstname>","<Lastname>","<Billingadress>","<CreditcardNo>","<CreditcardType>","<SelectMonth>","<SelectYear>","<CVV>"
   	Then User should click on BookNow
   	Then User should get Booking Confirmation


    Examples: 
      
      | username   |  password   |Location | Hotels| RoomType| NumberOfRooms| CheckInDate  | CheckOutDate | AdultsPerRoom | ChildernPerRoom|Firstname|Lastname|Billingadress|CreditcardNo|CreditcardType|SelectMonth|SelectYear|CVV|
      | Rachana123 | Adactin@123 | London  |Hotel Sunshine|Double|2|12/01/2022|15/01/2022|2|1|Rachana|Nelakurthi|flat 1 chennai|4000453256765432|MAST|3|2012|456|
