
Feature: User

  Scenario: Datatable
  
    Given I want to create an account
    When I enter my data
    	| name  | password | status  |
      | name1 | asdf		 | success |
      | name2 | lkjh		 | Fail    |
    
    Then I verify the account
 
      