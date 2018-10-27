package observer;

public class SubscriberObservable implements Observable {

    private String name;

    public SubscriberObservable(String name) {
        this.name = name;
    }

    public void readNewspaper(String name){
        System.out.println(this.name + " przeczytał gazetę z prenumeraty " + name);
    }
}
