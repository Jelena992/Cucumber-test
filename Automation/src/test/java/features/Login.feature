Feature: 

	
	@XRAYT-125 @XRAYT-116
	Scenario: Cucumber: Test Contact Form
		Given User is on NetBanking landing page
		When User login into application with username and password
		Then Home page is populated
		And Cards are displayed
		