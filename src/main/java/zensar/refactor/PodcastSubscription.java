package zensar.refactor;

class PodcastSubscription extends Subscription {
    public PodcastSubscription(String billingCycle) {
        super(calculateCost(billingCycle), billingCycle);
    }

    @Override
    public void initiateSubscription() {
        System.out.println("Your Podcast subscription created. Cost per cycle is " + cost);
    }

    @Override
    public int getBillingCycles() {
        return subcriptionTimeline;
    }
    
    protected static int calculateCost(String billingCycle) {
    	int cost = 0;
    	if("Monthly".equals(billingCycle)) {
    		cost = 50;
    	} else if("Quarterly".equals(billingCycle)) {
    		cost = 100;
    	} else if ("Annualy".equals(billingCycle)) {
    		cost = 300;
		} else {
			throw new IllegalArgumentException("Invalid billing cycle: " + billingCycle);
		}
        return cost;
    }
    
}
