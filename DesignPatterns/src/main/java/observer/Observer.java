package observer;

import java.util.ArrayList;
import java.util.List;

public abstract class Observer {
    List<Observable> subscribers;

    public Observer() {
        this.subscribers = new ArrayList<Observable>();
    }

    public void subscribe(Observable subsrciber) {
        this.subscribers.add(subsrciber);
    }

    public void sendToAll() {
        for (Observable subscriber : this.subscribers) {
            subscriber.readNewspaper(getName());
        }
    }

    protected abstract String getName();
}
