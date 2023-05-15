public class PositiveFeedbackStrategy implements FeedbackStrategy {
    @Override
    public void feedback() {
        System.out.println("Good job!");
    }
}
