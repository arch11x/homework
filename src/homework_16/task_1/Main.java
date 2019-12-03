package homework_16.task_1;

public class Main {
    public static void main(String[] args) {
        MyThread customThread = new MyThread("MyThread");
        customThread.start();
        // не стоит забывать про метод join()
    }
}
