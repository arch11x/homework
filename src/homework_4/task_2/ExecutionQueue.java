package homework_4.task_2;

public class ExecutionQueue {
    private static String msg; // нужен абзац
    static {
        msg = "static block";
    } // нужен абзац
    {
        msg = "regular init block";
    } // нужен абзац
    public ExecutionQueue() {
        msg = "constructor value";
    } // нужен абзац
    public static void main(String[] args) {
        ExecutionQueue executionQueue = new ExecutionQueue();

        System.out.println(ExecutionQueue.msg);
    }
}
