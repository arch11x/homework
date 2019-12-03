package homework_16.task_3;

// +
public class Main {
    public static void main(String[] args) throws InterruptedException {
        ToysStore toysStore = new ToysStore();

        int provideFirst = 100;
        int provideSecond = 50;

        Runnable first = () -> {
            for (int i = 0; i < provideFirst; i++) {
                toysStore.putToy();
            }
        };
        Runnable second = () -> {
            for (int i = 0; i <provideSecond; i++) {
                toysStore.putToy();
            }
        };
        Thread threadFirst = new Thread(first);
        Thread threadSecond = new Thread(second);

        threadFirst.start();
        threadSecond.start();

        threadFirst.join();
        threadSecond.join();

        System.out.println("Toys in the shop: " + toysStore.getNumOfToys());
    }
}
