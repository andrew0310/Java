package component;

public class Main {
    public static void main(String[] args) {

        SchedulerComposite mondayScheduler = new SchedulerComposite("MONDAY JOB");
        SchedulerComposite friedEggs = new SchedulerComposite("FRIED EGGS");
        SchedulerComposite makeCoffee = new SchedulerComposite("MAKE COFFEE");
        FinalJobLeaf readNewsPaper = new FinalJobLeaf("READ NEWSPAPER");

        SchedulerComposite breakfast = new SchedulerComposite("BREAKFAST");
        breakfast.addJob(friedEggs);
        breakfast.addJob(makeCoffee);
        breakfast.addJob(readNewsPaper);

        SchedulerComposite lunch = new SchedulerComposite("LUNCH");
        SchedulerComposite makeFriedSteak = new SchedulerComposite("MAKE FRIED STEAK");
        FinalJobLeaf drinkTea = new FinalJobLeaf("DRINK TEA");
        lunch.addJob(makeFriedSteak);
        lunch.addJob(drinkTea);

        mondayScheduler.addJob(breakfast);
        mondayScheduler.addJob(lunch);
        mondayScheduler.listAllComponents();
    }
}
