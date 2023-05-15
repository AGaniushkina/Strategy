public class Staffer extends Worker {
    public Staffer() {
        super(new BaseSalaryStrategy(), new PositiveFeedbackStrategy());
    }
}
