package component;

public class FinalJobLeaf extends JobComponent {
    protected FinalJobLeaf(String name) {
        super(name);
    }

    public void completeJob() {
        System.out.println("To zadanie nie może być podzielone na mniejsze");
    }
}
