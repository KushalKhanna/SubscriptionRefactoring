package zensar.refactor;

class SubscriptionFactory {
	
    public static Subscription createSubscription(String subscriptionType, String billingCycle) {
        switch (subscriptionType) {
            case "Video":
                return new VideoSubscription(billingCycle);
            case "Music":
                return new MusicSubscription(billingCycle);
            case "Podcast":
                return new PodcastSubscription(billingCycle);
            default:
                throw new IllegalArgumentException("Invalid subscription type: " + subscriptionType);
        }
    }
}
