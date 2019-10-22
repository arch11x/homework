package homework_5.task_1;

public interface Computer {
    default void on() {
        System.out.println("Computer on");
    }

    default void off() {
        System.out.println("Computer off");
    }

    default void reset() {
        System.out.println("Computer reset");
    }
}
