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
Feature: Verify Place API Test
  

  @Addplace @Regression
  Scenario: Verify add place API
    Given Add place payload
    When user call "addplace" and "post" the request
    Then verify status code "200"
    And Verify "place_id" in the response
    And Verfiy "getpalce" response with "name"
	@Deleteplace @Regression
  Scenario: Verify Delete place API
  Given Delete place payload
  When user call "deleteplace" and "post" the request
  Then verify status code "200"
 