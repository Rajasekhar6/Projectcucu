Feature: smoke test of the trianz login

   Scenario: Test login with valid credentials
   Given Open firefox and start application
   When I enter valid username and valid password
   Then user should be able to login successfully
	