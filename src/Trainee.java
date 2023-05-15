public class Trainee extends Worker {
    public Trainee() {
        super(new BaseSalaryStrategy(), new PositiveFeedbackStrategy());
    }
}
