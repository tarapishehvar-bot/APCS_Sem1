public class StepTracker {
    private int numSteps;
    private int activeDay;
    private int requirement;
    private int numDays;
    public StepTracker(int require){
        requirement=require; 
    }
    public void addDailySteps(int steps){
        numSteps= numSteps+steps;
        numDays++;
        if (steps>requirement){
            activeDay++;
        }
    }
    public double averageSteps(){
        return numSteps/numDays;
    }
    public int activeDays(){
        return activeDay;
    }
    
}