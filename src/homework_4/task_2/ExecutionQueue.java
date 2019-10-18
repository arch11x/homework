package homework_4.task_2;

public class ExecutionQueue {
    private static String msg;
    static {
        msg = "static bloc";
    }
    {
        msg = "regular init block";
    }
    public ExecutionQueue() {
        msg = "constructor value";
    }
    public static void main(String[] args) {
        ExecutionQueue executionQueue = new ExecutionQueue();

        System.out.println(ExecutionQueue.msg);
    }
}