public class NegativeFeedbackStrategy implements FeedbackStrategy {
    @Override
    public void feedback() {
        System.out.println("Bad job!?");
    }
}
