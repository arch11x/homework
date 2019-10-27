package homework_6.task_2;

    public class Car {
        private Tran transmission;
        private Engine engine;
        private boolean carRide = false;
        private boolean gasPedal = false;

        public Car() {
            this.transmission = new Tran();
            this.engine = new Engine();
        }

        public Tran getTran() {
            return transmission;
        }

        public Engine getEngine() {
            return engine;
        }

        public void ride() {
            if (getEngine().isWorking() && carRide == false) {
                carRide = true;
                engine.startEngine();
                transmission.changeGearUp();
                gasPedal();
                speed();
            }
            return;
        }

        public void gasPedal() {
            gasPedal = true;
            System.out.println(" ");
        }

        public void speed() {
            if (carRide == true) {
                System.out.println("Speed = " + getTran().getNumberOfGear() * 20);
            } else System.out.println("Speed = 0");
        }
    }


