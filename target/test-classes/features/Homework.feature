@AddAccountFeature
Feature: Add account Functionality Validation

@regression
  Scenario Outline: User should be able to login and add account
    Given User is on codefios login page
    When User enters username as '<userName>'
    When User enters password as '<password>'
    When User clicks on sign in button
   
    Then User should be landing  on dashboard page
    When User clicks on Account List link

    Then User should be landing on Account List page
    When User clicks on Add Account button
    When User enters Account name as '<accountName>'
    When User enters description as '<description>'
    When User enters intial balance as '<initialBalance>'
    When User enters account Number as '<accountNumber>'
    When User enters contact Person as '<contactPerson>'
    When User clicks on save button
    Then User should be able to see account added alert
    
    Examples:
    |userName         |password|accountName    |description   |initialBalance|accountNumber|contactPerson|
    |demo@codefios.com|abc123  |My Test Account|New Account   |70000         |7890         |Alicy        |
    
    

#@codefiosLoginScenario1 @smoke
  #Scenario:1 - User should be able to login with valid credentials
    #Given User is on codefios login page
    #When User enters username as "demo1@codefios.com"
    #When User enters password as "abc123"
    #When User clicks on sign in button
    #Then User should be landing on dashboard page
#
 #@codefiosLoginScenario2 
      #Scenario:2 - User should be able to login with valid credentials
    #Given User is on codefios login page
    #When User enters username as "demo1@codefios.com"
    #When User enters password as "abc123"
    #When User clicks on sign in button
    #Then User should be landing on dashboard page