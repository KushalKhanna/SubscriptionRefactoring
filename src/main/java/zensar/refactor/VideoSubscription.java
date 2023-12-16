package zensar.refactor;

class VideoSubscription extends Subscription {
    public VideoSubscription(String billingCycle) {
        super(calculateCost(billingCycle), billingCycle);
    }

    @Override
    public void initiateSubscription() {
        System.out.println("Your Video subscription created. Cost per cycle is " + cost);
    }

    @Override
    public int getBillingCycles() {
        return subcriptionTimeline;
    }
    
    private static int calculateCost(String billingCycle) {
        // TODO: Add your logic to calculate the cost based on subscriptionType and billingCycle
    	int cost = 0;
    	if("Monthly".equals(billingCycle)) {
			cost = 10;
		} else if("Quarterly".equals(billingCycle)) {
			cost = 20;
		} else if ("Annualy".equals(billingCycle)) {
			cost = 60;
		} else {
			throw new IllegalArgumentException("Invalid billing cycle: " + billingCycle);
		}
        return cost;
    }
}
