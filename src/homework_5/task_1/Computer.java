package homework_5.task_1;

// я уже рассказывал на лекции про использование дефолтных методов, коротко - старайся их не использовать
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
