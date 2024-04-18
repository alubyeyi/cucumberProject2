@negativeLoginFeature
Feature: Codefios page Negative login functionality validation

Background:
Given User is on codefios login page

@negativescenario1 @regression
Scenario Outline:1 - User should NOT be able to login with valid credentials
When User enters username as "<userName>"
When User enters password as "<password>"
When User clicks on sign in button
Then User should be landing on dashboard page

Examples:
| userName           | password |
| demo1@codefios.com | abc123   |
| demo1@codefios.com | abc124   |
| demo@codefios.com  |abc124    |
| demo1@codefios.com | abc124   |
|                    |          |

@negativescenario2 
Scenario: User should NOT be able to login with valid credentials
When User enters username as "demo@codefios.com"
When User enters password as "abc124"
When User clicks on sign in button
Then User should be landing on dashboard page