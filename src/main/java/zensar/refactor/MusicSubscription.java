package zensar.refactor;

class MusicSubscription extends Subscription {
    public MusicSubscription(String billingCycle) {
        super(calculateCost(billingCycle), billingCycle);
    }

    @Override
    public void initiateSubscription() {
        System.out.println("Your Music subscription created. Cost per cycle is " + cost);
    }

    @Override
    public int getBillingCycles() {
        return subcriptionTimeline;
    }
    
    private static int calculateCost(String billingCycle) {
    	int cost = 0;
    	if("Monthly".equals(billingCycle)) {
			cost = 20;
		} else if("Quarterly".equals(billingCycle)) {
			cost = 50;
		} else if ("Annualy".equals(billingCycle)) {
			cost = 150;
		} else {
			throw new IllegalArgumentException("Invalid billing cycle: " + billingCycle);
		}
        return cost;
    }
}
