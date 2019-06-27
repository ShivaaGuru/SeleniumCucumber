
Feature: Outline


  Scenario Outline: Login multiple users
    Given I want to enter "<username>"
    When I want to entersecure "<password>"
    Then the page is displayed

    Examples: 
      | username  | password | 
      | Shivaa 		| abcd@123 | 
      | Guru	 		| abcd@456 |