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
Feature: Customer Functionality
I want to use this template for my feature file

@tag1
Scenario: Create New Customer
Given user is on Actitime Login page
And user login to the application with valid credentials
When  user click on tasks followed by create customer button
Then user validate the customer creation page
And Fill all the customer details and click on create customer button
Then  Customer will be created successfully
And user validate the success message

@tag2
Scenario Outline: Create Multiple Customers
Given user is on Actitime Login page
And User login to the application with valid credentials
When user click on tasks followed by create customer button
Then user Validates the Customer creation page
And Fill <customer_name> and <Customer_desc> and click on create customer button
Then Customer will be created successfully
And user validates the success message


Example:
    
    | customer_name| customer_desc        |
    | Pushpa       | First customer dec   |
    | Laxmi        | Second customer desc |
    |Vaishnavi     | Third customer desc  |
    |Pratap        | Fourth customer des  |
    |Lavanya       | fifth Customer desc  |
    | Aishwarya    | sixth customer desc  |
    | Divya        | Seventh customer desc|
    | Murali       | Eighth customer desc |
    | Suman        | Ninth Customer desc  |
    | shyamala     | Tenthcustomer desc   |      





  



    

