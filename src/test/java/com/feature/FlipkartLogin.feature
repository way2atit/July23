@FlipkartLogin 
Feature: Login Test 



Scenario Outline: 
	Given user navigate ot flipkart 
	When user entered username "<uname>" 
	And user entered  pass "<Password>" 
	Examples: 
		|uname|Password|
		|a|a1|
		|b|b1|
		
Scenario Outline: 
	Given user navigate ot flipkart 
	When user entered username "<uname>" and pass "<Password>" 
	Examples: 
		|uname|Password|
		|a|a1|
		
	

	
	
	