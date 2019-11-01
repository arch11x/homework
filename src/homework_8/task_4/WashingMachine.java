package homework_8.task_4;

public class WashingMachine {
    public static void main(String[] args) {
        WashingMachine washingMachine = new WashingMachine();
        washingMachine.work();
    }

    private void work() {
        try {
            System.out.println("I'm working");
            while (true) { // лучше завести boolean поле и на напрямую true
                if (System.currentTimeMillis() % 2 == 1) {
                    throw new MyException("Error 404;("); // 404 это код спец ошибки из http и используется для других целей 
                }
            }
        } catch (MyException e) {
            System.err.println(e.getMessage());
        } finally {
            drainWater();
        }
    }

    private void drainWater() {
        System.out.println("Water has been drained");
    }
}

