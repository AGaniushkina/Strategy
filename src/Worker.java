public class Worker {
    SalaryStrategy salaryStrategy;
    FeedbackStrategy feedbackStrategy;

    public Worker(SalaryStrategy salaryStrategy, FeedbackStrategy feedbackStrategy) {
        this.salaryStrategy = salaryStrategy;
        this.feedbackStrategy = feedbackStrategy;
    }

    public void salary() {
        salaryStrategy.salary();
    }

    public void task() {
        System.out.println("New task!");
    }

    public void feedback() {
        feedbackStrategy.feedback();
    }

    public void setSalaryStrategy(SalaryStrategy salaryStrategy) {
        this.salaryStrategy = salaryStrategy;
    }

    public void setFeedbackStrategy(FeedbackStrategy feedbackStrategy) {
        this.feedbackStrategy = feedbackStrategy;
    }
}
