package homework_17.task_3;

import java.util.concurrent.Callable;

// +
public class Factorial implements Callable<Long> {
    private int start;
    private int end;

    public Factorial(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public Long call() {
        long result = (long) start;
        for (int i = start + 1; i <= end; i++) {
            result *= i;
        }
        return result;
    }
}
