Feature: Create Facebook Account

Background: Launching facebook function
#Given Launch the facebook website "https://www.facebook.com/"
Given Click on Create new account

@createnewaccount
Scenario Outline: Enter contact informations for all the fields and Create new account
When Enter the name "<Firstname>"
And Enter the surname "<Surname>"
And Enter the number "<MobileNo>"
And Enter the password "<Password>"
And Select date of birth "<Date>"
And Select date of month "<Month>"
And Select date of year "<Year>"
And Click on Sign Up
Then Take screenshot "<Firstname>"
And Brokenlink "https://www.facebook.com/"

Examples:
|Firstname|Surname|MobileNo  |Password  |Date|Month|Year|
|Suriya   |P      |7569034021|Suriya@123|21  |Jun  |1999|
#|Karthi   |P      |9080234567|Suriya@456|25  |Jul  |2000|
#|Siva     |P      |8045782902|Suriya@789|17  |Sep  |2001|
#|Kesavan  |P      |7097802347|Suriya@012|20  |Oct  |2002|
