package homework_10.task_3;

public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[]{new BMW(2674), new Lada(2514)};
        Garage<Lada> parkLada = new Garage<>(new Lada[]{new Lada(4634)});
        Garage<BMW> parkBmw = new Garage<>(new BMW[]{new BMW(4238)});
        Garage<Car> parkCars = new Garage<>(cars);
        System.out.println(parkLada);
        System.out.println(parkBmw);
        System.out.println(parkCars);
    }
}