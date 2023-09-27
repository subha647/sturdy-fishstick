@tag
Feature: Login To PeopleGrove

  @tag1
  Scenario: User Login
    Given I am on landing page
    When I click on Sign in Button
    And I passed email address
    And I passed Password
    And Click Login Button
    Then Navigate to homepage
    Then navigate to jobs page
    Then Click on the QA job
    Then Click on ask question
    Then Pass the message to user
    Then Press the send button
    Then Open Inbox
    Then search for the user
    Then search for the text
    
  
 
