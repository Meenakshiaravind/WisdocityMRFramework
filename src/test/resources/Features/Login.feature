Feature: Login Page for Wisdocity AI

	Scenario: Check Login is successful with valids credentials
		Given User navigates to login page
		When User clicks on Login button
		And User enters Valid Username and Password
		And clicks on the Login button
		Then User should see message "Wisdocity.ai"