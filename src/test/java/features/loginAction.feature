#Author: your.email@your.domain.com
#Keywords Summary :
#Feature: List of scenarios.
#Scenario: Business rule through list of steps with arguments.
#Given: Some precondition step
#When: Some key actions
#Then: To observe outcomes or validation
#And,But: To enumerate more Given,When,Then steps
#Scenario Outline: List of steps for data-driven as an Examples and <placeholder>
#Examples: Container for s table
#Background: List of steps run before each of the scenarios
#""" (Doc Strings)
#| (Data Tables)
#@ (Tags/Labels):To group Scenarios
#<> (placeholder)
#""
## (Comments)
#Sample Feature Definition Template



Feature: Login to HMS
 @login
  Scenario Outline: Successful login with Username, Password, Institution and Service Centre
    
    Given User is on HMS login Page
    When User give <User> and <Password>
    And select "DISTRICT MODEL HOSPITAL PEROORKADA" and "GENERAL MEDICINE"
    And click Signin
    And Ignore Last Login
    Then User will be redirected to HomePage
    
    Examples:
    | User    | Password |
    |10000T24 | 10000T21 |
    |10000T24 | 10000T24 |
    
  
