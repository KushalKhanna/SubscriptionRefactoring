package zensar.refactor;


public class SubscriptionProcessor {
	
	public static void main(String[] args) {		
		String subscriptionType = "Video"; // Possible value is Video, Music or Podcast
		String billingCycle = "Annualy"; // Possible value is Monthly, Quarterly or Annual
		SubscriptionProcessor process = new SubscriptionProcessor();
		process.createSubscriptionAndCalculateCost(subscriptionType, billingCycle);			
	}
	
	public int createSubscriptionAndCalculateCost(String subscriptionType, String billingCycle) {
		Subscription subscription = SubscriptionFactory.createSubscription(subscriptionType, billingCycle);
        subscription.initiateSubscription();
		return getTotalCostforTwelveMonths(subscription, billingCycle);	
	}
	
	// calculate total amount for next 12 months
	private static int getTotalCostforTwelveMonths(Subscription subscription, String billingCycle) {
		
		// TODO 3 Extract this logic to a function in appropriate class
		
		int total = subscription.getCost() * subscription.getBillingCycles();
		
		// THIS IF ELSE FOR ADDING YEAR IN TEXT IF CHARGIN ANNUALY. DO IT VIA TERTIARY OPERATOR
		if(subscription.getBillingCycles() == 1) {
			System.out.println("Total cost for next "+ subscription.getBillingCycles() +" year will be " + total);
		
		} else {
			System.out.println("Total cost for next "+ subscription.getBillingCycles() +" months will be " + total);
		}
		
		return total;
	}
	
	
}
