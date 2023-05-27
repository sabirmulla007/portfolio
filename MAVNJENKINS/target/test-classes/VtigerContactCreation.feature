
@tag
Feature: Vtiger Contact Creation validation

  @tag1
  Scenario: Vtiger Contact Creation 
    Given i am on chrome browser 
    
    When I i logged in the website using valid vredentials 
    And I Click on 3 dots go to marketing and go to contact button click on create contact button and create contact using <name>, <surname> and <mobile no>  
    And after that delete that contact
    Then I validate if contact is deleted or not 
    

  @tag2
  Scenario Outline:Vtiger Contact Creation 
    Given I i logged in the website using valid vredentials  
    When  I Click on 3 dots go to marketing and go to contact button click on create contact button and create contact using <name>, <surname> and <mobile no>
    And after that delete that contact2
    Then I validate if contact is deleted or not2

    Examples: 
      | name  |    surname|   mobile no   |
      | name1 |   sccc    | 8888888995    |
      | name2 |     sddd  | 8888878123    |
