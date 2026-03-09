import java.util.ArrayList;
import java.util.List;

public abstract class Subject {

    protected String state;
    protected List<Observer> observers;

    public Subject() {
        observers = new ArrayList<>();
    }

    public void setState(String state, String machineName) {
        this.state = state;
        notifyAllObservers(machineName);
    }

    public void attach(Observer o) {
        observers.add(o);
    }

    public void notifyAllObservers(String machineName) {
        for (Observer observer : observers) {
            observer.update(state, machineName);
        }
    }

    public String getState() {
        return state;
    }
}