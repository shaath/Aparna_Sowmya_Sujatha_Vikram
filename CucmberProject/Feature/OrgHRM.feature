Feature: Check OrangeHRM Login and Logout

	Scenario: OrangeHRM Login Check
		Given The Browser Invoked and Navigated to OrangeHRM
		When Tester Enter Username, Password
		And Tester Login button
		Then Home page displyed with welcome admin link
	
	Scenario: Logout Check 
		When Tester click on WelcomeAdmin link
		And Tester clicks on Logout link
		Then Login page display