
Feature: Tags

  @smoke
  Scenario: Password
    Given User enters new Password
    And Confirms new password
    When user clicks the submit button
    Then password is changed
  @uat
  Scenario: login   
  	Given User enters LoginName
  	And Enters password
  	When user clicks ok button
  	Then Home will be dispalyed
  	@pro
  	Scenario: Product
  	
  	Given User search for the product name
  	When clicks the search button
  	Then product page will be displayed
  	
  	@Pay
  	Scenario: Product
  	
  	Given User select the product
  	When User choose the payment option
  	Then User confirms the order
  	    