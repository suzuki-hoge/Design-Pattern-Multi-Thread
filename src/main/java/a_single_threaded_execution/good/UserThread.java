package a_single_threaded_execution.good;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UserThread extends Thread {
    private final Gate gate;
    private final String name;
    private final String address;

    public void run() {
        System.out.println(name + " BEGIN");
        while (true) {
            gate.pass(name, address);
        }
    }
}
