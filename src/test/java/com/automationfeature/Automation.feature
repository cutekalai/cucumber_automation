Feature: Automation Practice for dresses Purchasing  In Automation Application


Background: Sign In	

Given user Launch The Application

When user Enter The signin button

And user Enter The Emailaddress in Email Textbox

And user Enter The Password in Password Textbox

Then user Click On The SignIn Button And It Navigate To women purchase Page


Scenario: Click WomenDress Page

When user Select The womendress 

And user Click the list icon1
And user select the fadeddress

And user Select The Quantity In Text Box
	
And user Select The Size In checkbox 

And user click The addtocart1

Then user Click the Signout1


Scenario: Click Dresses Page

When user Select The dresses 

And user Click the list icon2

And user select the dress purchase

And user clickthe addtocart2

Then user click the Signout2



Scenario: Click Tshirts Page

When user Select The Tshirts

And user Click The list icon3

And user select the tshirtspurchase

And user click the addtocart3

And user Click The Proceed to check1

And user Click The Proceed to check2

And user Click The Proceed to check3

And user Click The Radio Button for Termsofconditions

And user Select The proceed to check4

And user click The paybycheck

And user Click The Confirm Order

Then user click the Signout3








