package homework_17.task_1;

// почему оно считает от 0-9, а потом бросает ошибку? но все же завершается

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Garage addThread = new Garage();

        int numOfElements = 10;

        Runnable runnable = () -> {
            for (int i = 0; i < numOfElements; i++) {
                addThread.addToList(String.valueOf(i));
            }
        };
        Thread threadFirst = new Thread(runnable);
        Thread threadSecond = new Thread(runnable);

        threadFirst.start();
        threadSecond.start();

        threadFirst.join();
        threadSecond.join();

        System.out.println(addThread.getList().size());
    }
}
