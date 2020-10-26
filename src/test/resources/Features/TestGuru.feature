Feature: Reset functionality on login page of Application
  As a user
  I want to.
  So that.
  Scenario Outline: Verification of reset button with numbers of credential
    Given Open the Firefox and launch the application
    When I enter the Username "<username>" and Password "<password>"
    And I reset the credential
    Then I am on the page "<pageName>"
    Examples: 
			|username  |password         |pageName|
			|User1     |password1        |login|
			|User2     |password2        |login|	
