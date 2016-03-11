package b_immutable;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class PrintPersonThread extends Thread {
    private Person person;

    public void run() {
        while (true) {
            System.out.println(Thread.currentThread().getName() + " prints " + person);
        }
    }
}
