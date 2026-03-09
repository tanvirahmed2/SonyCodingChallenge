public class Machine extends Subject {

    private String name;

    public Machine(String name) {
        super();
        this.name = name;
        this.state = "IDLE";
    }

    public String getName() {
        return name;
    }

    public void changeState(String newState) {
        setState(newState, name);
    }
}