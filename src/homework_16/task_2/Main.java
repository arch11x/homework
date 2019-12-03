package homework_16.task_2;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Runnable runnable = new MyThread();

        Thread thread = new Thread(runnable);

        thread.start();
        thread.join();
        System.out.println("Main finished");
    }
}
