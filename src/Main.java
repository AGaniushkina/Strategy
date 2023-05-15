public class Main {
    public static void main(String[] args) {
        Staffer staffer = new Staffer();
        staffer.salary();
        staffer.task();
        staffer.feedback();
        Trainee trainee = new Trainee();
        trainee.setFeedbackStrategy(new NegativeFeedbackStrategy());
        trainee.task();
        trainee.salary();
        trainee.setSalaryStrategy(new VacationSalaryStrategy());
        trainee.salary();
        trainee.feedback();
    }
}