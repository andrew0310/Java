package component;

public abstract class JobComponent {

    public String name;

    public abstract void completeJob();

    protected JobComponent(String name) {
        this.name = name;
    }
}
