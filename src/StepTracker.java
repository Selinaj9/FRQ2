public class StepTracker {
    private int active;
    private int steps;
    private int activeDays;
    private int days;

    public StepTracker(int a) {
        active = a;
        steps = 0;
        activeDays = 0;
        days = 0;
    }

    public void addDailySteps(int s) {
        steps += s;
        days++;
        if (s >= active) {
            activeDays++;
        }
    }

    public int activeDays() {
        return activeDays;
    }

    public double averageSteps() {
        if (days == 0) {
            return 0;
        }
        return (double) steps / days;
    }
}