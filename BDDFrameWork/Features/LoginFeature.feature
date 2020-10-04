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
@tag  
Feature: To test the Login Functionality
  I want to use this template for my feature file
  
  Background: Url launching
  Given when i Open the Browser
  
   

  @tag1
  Scenario: Valid Login
  Given i go "https://www.flipkart.com/"
  When i enter "Pranay"
  When i enter "Raj"
  When i click and Submit
  Then i should be able to land in Home Page "True"
  
  
    @tag1
  Scenario: Valid Login
  Given i go "https://www.flipkart.com/"
  When i enter "username"
  When i enter "pass"
  When i click and Submit
  Then i should be able to land in Home Page "Flase"
