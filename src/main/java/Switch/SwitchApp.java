package Switch;

import Switch.Switch;

public class SwitchApp {
    public static void main(String[] args) {
        Switch sw = new Switch(Switch.State.OFF);

        sw.push();
    }
}
