package homework_6.task_2;

    public class Engine {

        private boolean working;

        public void startEngine() {
            if (working) {
                System.out.println("Engine is started");
            } else {
                working = true;
            }
        }

        public void stopEngine() {
            if (working) {
                working = false;
            } else {
                System.out.println("Engine is stopped");
            }
        }

        public boolean isWorking() {
            return working;
        }
    }
