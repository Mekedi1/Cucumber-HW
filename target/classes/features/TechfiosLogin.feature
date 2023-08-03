@LoginFeature @Regression
Feature: Techfios billing login page functionality validation

  Background: 
    Given User is on the techfios login page
		When User enters username as "demo@techfios.com"

@LoginScenario1 @Smoke @Sanity
  Scenario: User should be able to login with valid credential
    When User enters password as "abc123"
    When User clicks on sign in button
    Then User should land on dashboard page
    And User clicks on bankCash
    And User clicks on newAccount
    And User should land on accounts page
    And User enters accoutTitle as "saving"
    And User enters discription as "abcd"
    And User enters initialBalance as "50"
    And User enters accountNumber as "123456789"
    And User enters contactPerson as "Mekedelawit Asfaw"
    And User enters phone as "123-345-6789"
    And User enters internetBankingURL as "https://techfios.com/billing/?ng=accounts/add/"
    And User clicks on 

@LoginScenario2
  Scenario: User should not be able to login with valid credential
    When User enters password as "abc1234"
    When User clicks on sign in button
    Then User should land on dashboard page

  