package homework_5.task_1;

import jdk.swing.interop.SwingInterOpUtils;

// Main -> не лучшее название для класса, который имплементит интерфейс Computer, например, Laptop
public class Main implements Computer {
    public void reset() {
        System.out.println("Computer reset and update" );
    }
}
