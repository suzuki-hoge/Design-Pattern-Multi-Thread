package c_guarded_suspension;

public class Main {
    public static void main(String[] args) {
        RequestQueue requestQueue = new RequestQueue();
        new ClientThread(requestQueue, "Alice", 12345).start();
        new ServerThread(requestQueue, "Bobby", 56789).start();
    }
}
