@codefiosFeature
Feature: Codefios page login functionality validation

Scenario: 1 - User should be able to login with valid credentials
Given User is on codefios login page
When User enters username as "demo@codefios.com"
When User enters password as "abc123"
When User clicks on sign in button
Then User should be landing on dashboard page

Scenario: 2 - User should be able to login with valid credentials
Given User is on codefios login page
When User enters username as "demo@codefios.com"
When User enters password as "abc123"
When User clicks on sign in button
Then User should be landing on dashboard page