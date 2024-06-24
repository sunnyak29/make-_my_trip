Feature: Test MakeMyTrip 

 Scenario: Verify MakeMyTrip HomePage
	  Given User is on  MakeMyTrip HomePage
		Then verify user is on MakeMyTrip HomePage

 #Scenario: Get lowest fare for one way outstation cab 
    #Given MakeMyTrip HomePage
    #Then Skip login and Create Account
    #Then Click on Cabs icon
    #Then User set  Delhi and Manali in from and To text box options
    #And User Click on search icon
    #Then Verify Sorted By option is Price Lowest To Highest
    #Then User select suv form Cab Type 
    #Then Get the lowest charges
    #And  Closedriver
  #
 #Scenario: Capture error message in giftcard section by filling wrong email id
#	  Given User is on  MakeMyTrip HomePage
    #Then Skip login and Create Account
    #Then Click on Gift Cards icon
    #When WebPage Title is Gift Cards - Buy Gift Vouchers Online, Gift Vouchers | MakeMyTrip.com
    #Then Click on Wedding Gift Card option
    #Then  Select E-Mail in Send Via option
    #Then Fill Recipients and sender details while providing wrong email id
    #And Click on BUY NOW button
    #Then Capture the error message
    #
 #Scenario: verify text on payment page by filling dummy details in giftcard section 
    #Given User is on Gift Cards home section
    #When WebPage Title is Gift Cards - Buy Gift Vouchers Online, Gift Vouchers | MakeMyTrip.com
    #Then Click on Wedding Gift Card option
    #Then  Select E-Mail in Send Via option
    #Then Fill Recipients and sender details 
    #And Click on BUY NOW button
    #Then Verify Payment page displayed text You are viewing this booking at the best price
    #And  Closedriver
#
    #
  #Scenario: Capture the option available for no.of adult and children in hotel booking section
    #Given User is on  MakeMyTrip HomePage
    #Then Skip login and Create Account
    #Then Click on Hotels icon
    #And  click on ROOMS & GUESTS option
    #Then Get the details available
    #And  Closedriver
    #
   