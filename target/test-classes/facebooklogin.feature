Feature: Facebook login

#Background: Launching facebook function
#Given Launch the facebook site "https://www.facebook.com/"

@login
Scenario Outline: Login to facebook
When User enter phone number "<MobileNo>"
And User enter password "<Password>"
Then User clicks on login button

Examples: 

|MobileNo  |Password  |
|8903237483|Suriya@123|
#|7609456890|Gugan@456 |
#|9567234580|Mugen@789 |
