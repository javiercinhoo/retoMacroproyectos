@Order
Feature: Select a Book from Store 

Scenario Outline: Scenario Outline name: I am sign in Book Store and Select a Book

Given I am in demoqa page
And I write the <User> and <Password>
When  I search a book with name book
And  select a book 
Then I back the coleccion 
And I validate a book

Examples:
    |User    |Password  |
    |Prueba1 |Prueba1*|
   
