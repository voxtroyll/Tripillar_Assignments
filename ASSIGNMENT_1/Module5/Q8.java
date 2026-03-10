package Module5;

class LifeCycleThread extends Thread {
    public void run() {
        try {
            Thread.sleep(1000);
        } catch (Exception e) {
        }
    }
}

public class Q8 {
    public static void main(String[] args) throws Exception {

        LifeCycleThread t = new LifeCycleThread();

        System.out.println("State after creation: " + t.getState());

        t.start();
        System.out.println("State after start: " + t.getState());

        Thread.sleep(100);
        System.out.println("State while running/sleeping: " + t.getState());

        t.join();
        System.out.println("State after completion: " + t.getState());
    }
}