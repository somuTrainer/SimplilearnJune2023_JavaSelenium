Feature: Testing the gmail home page

Scenario: Test gmail login
Given I am on gmail login page
When I enter username and click on next button
And I enter password and I click on submit button
Then I should be on the inbox page