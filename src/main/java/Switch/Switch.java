package Switch;

public class Switch {
    public enum State {
        ON,
        OFF;
    }

    private State state = State.OFF;

    public Switch(State state) {
        this.state = state;
    }

    public void push() {
        switch (state) {
            case ON:
                System.out.println("The light is on.");
                break;
            case OFF:
                System.out.println("The light is off.");
                break;
            default:
                break;
        }
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }
}
