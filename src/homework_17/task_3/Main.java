package homework_17.task_3;


import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.*;

// +
public class Main {
    private static final int number = 5;
    private static final int threadsNumber = 2;

    public static void main(String[] args) throws InterruptedException, ExecutionException {
        ExecutorService executorService = Executors.newFixedThreadPool(threadsNumber);

        List<Callable<Long>> tasksList = new ArrayList<>();

        for (int i = 0; i < threadsNumber; i++) {
            tasksList.add(new Factorial(i * number / threadsNumber + 1, (i + 1) * number / threadsNumber));
        }

        List<Future<Long>> futures = executorService.invokeAll(tasksList);

        Long factorial = futures.get(0).get();
        for (int i = 1; i < futures.size(); i++) {
            factorial *= futures.get(i).get();
        }

        System.out.println(factorial);

        executorService.awaitTermination(500, TimeUnit.MILLISECONDS);
        executorService.shutdownNow();
    }
}
