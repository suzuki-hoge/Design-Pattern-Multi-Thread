package a_single_threaded_execution.good;

public class Main {
    public static void main(String[] args) {
        System.out.println("Testing Gate, hit CTRL+C to exit.");

        Gate gate = new Gate();
        new UserThread(gate, "Alice", "Alaska").start();
        new UserThread(gate, "Bobby", "BBrazil").start();
        new UserThread(gate, "Chris", "Canada").start();
    }
}
