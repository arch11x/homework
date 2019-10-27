package homework_6.task_2;

public class MainCar {
        public static void main(String[] args) {
            Car car = new Car();
            car.ride();
            car.getTran().changeGearUp();
            car.getEngine().stopEngine();
            car.speed();
    }
}

