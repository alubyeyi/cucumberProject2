@codefiosloginDbScenario1
Feature: Codefios page login functionality validation with data from MySQL server

Scenario: 1 - User should be able to login with valid credentials from DB
Given User is on codefios login page
When User enters "username" from mysql database
When User enters "password" from mysql database
But User clicks on sign in button
Then User should be landing on dashboard page

