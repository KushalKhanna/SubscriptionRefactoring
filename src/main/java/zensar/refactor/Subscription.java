package zensar.refactor;

import java.util.HashMap;
import java.util.Map;

abstract class Subscription {
    protected int cost;
    protected int subcriptionTimeline;
    Map<String, Integer> billingCycleMap;

    public Subscription(int cost, String billingCycle) {
    	this.billingCycleMap = fillHashMap();
        this.cost = cost;
        this.subcriptionTimeline = billingCycleMap.get(billingCycle);        
    }

    public abstract void initiateSubscription();

    public int getCost() {
        return cost;
    }

    public abstract int getBillingCycles();
    
    private static HashMap<String, Integer> fillHashMap() {
	    Map<String, Integer> billingCycleMap = new HashMap<>();
	   	billingCycleMap.put("Monthly", 12);
	   	billingCycleMap.put("Quarterly", 4);
	   	billingCycleMap.put("Annualy", 1);
	   	return (HashMap<String, Integer>) billingCycleMap;
	}
}
