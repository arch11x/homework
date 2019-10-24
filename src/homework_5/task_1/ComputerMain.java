package homework_5.task_1;

// +
public class ComputerMain {
    public static void main(String[] args) {
        System.out.println("=====FirstComputer=====");
        Main firstComputer = new Main();
        firstComputer.on();
        firstComputer.off();
        firstComputer.reset();

        System.out.println("=====SecondComputer=====");
        Main secondComputer = new Main();
        secondComputer.on();
        secondComputer.off();
    }
}
