Hi,

This maven project contains my submission for the Checkout System.

The application can be started with the following command:

mvn exec:java

Tests can also be ran with the test command:

mvn test

When reading the brief it was clear that I was to focus on isolating as best I could
the promotion policy behaviour from the checkout execution. My understanding was that
it required interchangeable promotion policies, so something along the lines of the 
strategy pattern would suit best. 

I make the distinction between items and pricing promotions as it made the most sense 
given the sequencing of the checkout:

Calculate total for items
Apply item discount based on item rules
Apply total discount based on pricing rules
 
thanks,

Joe
