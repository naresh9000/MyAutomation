Feature:Checking the Todays deal feature
Description:user is verifying the products as per the range of discount provided


Scenario:Verifying the Todays deal products above 10%off  or more
		Given user is on homePage
		When user clicks on see all deals link under Today's Deals
		And user clicks on 10%offer or more under Discount
		And user  count of products under 10%offer
		Then user verifiy that appilication is displayed with  all products above 10%offer


Scenario:Verifying the Todays deal products above 25%off  or more
		Given user is on homePage
		When user clicks on see all deals link under Today's Deals
		And user clicks on 25%offer or more under Discount
		And user finds the count of products under 25%offer
		Then user verifiy that appilication is displayed with  all products above 25%offer


Scenario:Verifying the Todays deal products above 50%offer
		Given user is on homePage
		When user clicks on see all deals link under Today's Deals
		And user clicks on 50%offer or more under Discount
		And user finds the count of products under 50%offer
		Then user verifiy that appilication is displayed with  all products above 50%offer

Scenario:Verifying the Todays deal products above 70%off  or more
		Given user is on homePage
		When user clicks on see all deals link under Today's Deals
		And user clicks on 70%offer or more under Discount
		And user finds the count of products under 70%offer
		Then user verifiy that appilication is displayed with  all products above 70%offer
				

 