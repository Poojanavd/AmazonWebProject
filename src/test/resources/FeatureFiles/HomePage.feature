Feature: verify menu titles in homepage 

Background: 
	Given I am on Amazon homepage 
	
Scenario:
Validate title for Menu - Mobile, Best Sellers, Todays Deals, Computer and Books 
	When I click on Mobiles Menu 
	And I validate the title of Mobiles Page 
	Then I navigate to Homepage 
	
	When I click on Best Sellers Menu 
	And I validate the title of Best Sellers Page 
	Then I navigate to Homepage 
	
	When I click on Todays Deals Menu 
	And I validate the title of Todays Deals Page 
	Then I navigate to Homepage 
	
	When I click on Computers Menu 
	And I validate the title of Computers Page 
	Then I navigate to Homepage 
	
	When I click on Books Menu 
	And I validate the title of Books Page 
	Then I navigate to Homepage 
	
