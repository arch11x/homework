package homework_16.task_2;

public class MyThread implements Runnable {
    private static final int ITERATIONS = 20;

    @Override
    public void run() {
        String name = Thread.currentThread().getName();
        for (int i = 0; i <= ITERATIONS; i++) {
            System.out.println(name + ": " + i);
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Finished " + name) ;
    }
}
