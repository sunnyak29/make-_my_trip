@ui
Feature: MakeMyTrip booking journeys

   @smoke
   Scenario: Verify MakeMyTrip HomePage
     Given User is on MakeMyTrip HomePage
		Then verify user is on MakeMyTrip HomePage

  @regression
  Scenario: Get lowest fare for one way outstation cab
    Given User is on MakeMyTrip HomePage
    Then Skip login and Create Account
    Then Click on Cabs icon
    Then User set  Delhi and Manali in from and To text box options
    And User Click on search icon
    Then Verify Sorted By option is Price Lowest To Highest
    Then User select suv form Cab Type 
    Then Get the lowest charges
   @regression
   Scenario: Capture error message in gift card section with an invalid email
	  Given User is on MakeMyTrip HomePage
    Then Skip login and Create Account
    Then Click on Gift Cards icon
    When WebPage Title is Gift Cards - Buy Gift Vouchers Online, Gift Vouchers | MakeMyTrip.com
    Then Click on Wedding Gift Card option
    Then  Select E-Mail in Send Via option
    Then Fill Recipients and sender details while providing wrong email id
    And Click on BUY NOW button
    Then Capture the error message
   @regression
   Scenario: Verify payment page text after entering gift card details
      Given User is on MakeMyTrip HomePage
      Then Click on Gift Cards icon
    When WebPage Title is Gift Cards - Buy Gift Vouchers Online, Gift Vouchers | MakeMyTrip.com
    Then Click on Wedding Gift Card option
    Then  Select E-Mail in Send Via option
    Then Fill Recipients and sender details 
    And Click on BUY NOW button
    Then Verify Payment page displayed text You are viewing this booking at the best price
   @regression
   Scenario: Capture adult options in the hotel booking section
      Given User is on MakeMyTrip HomePage
    Then Skip login and Create Account
    Then Click on Hotels icon
    And  click on ROOMS & GUESTS option
    Then Get the details available
       
