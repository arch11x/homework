package homework_10.task_3;

// +
public class Lada implements Car {
    private int num;

    public Lada(int num) {
        this.num = num;
    }

    @Override
    public int getNum() {
        return num;
    }

    @Override
    public void parkCar() {
        System.out.println("Car in garage");
    }

    @Override
    public String toString() {
        return "Lada{" +
                "num=" + num +
                '}';
    }
}
