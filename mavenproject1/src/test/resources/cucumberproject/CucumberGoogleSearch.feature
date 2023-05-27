

  @tag
  Feature: Trying to search something on google
  

  @tag1
  Scenario: Trying to search  on google.
    Given User is already on google search page
    When user types "name" in search input field and presses enter key
   
    Then user should be able to get result page with title having "name" 

  @tag2
  Scenario Outline: Trying to search <Texttobesearched> on google
    Given User is already on google search page 
    When User types <Texttobesearched> on google search page and presses enter 
    Then User should be able to get result page with title having <Texttobesearched>

    Examples: 
      |Texttobesearched     |
      | name                | 
      | name1               |     
      | name2               |     
