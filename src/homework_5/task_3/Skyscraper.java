package homework_5.task_3;

// поля класса должны быть приватными
public class Skyscraper implements Interface {

    // думаю это поле не должно быть статичным
    static int numberOfTenants;
    // думаю это поле не должно быть статичным
    static int numberOfFloors;
    String type;

    // сделай лучше конструктор с аргументами
    public Skyscraper() {
        numberOfFloors = 21;
        numberOfTenants = 100;
        type = "Skyscraper";
    }

    @Override
    public void getNumberOfFloors() {
        System.out.println("Number floors: " + numberOfFloors);
    }

    @Override
    public void turnOnTheHeating() {
// пустая строка не нужна
    }

    @Override
    public void getNumberOfTenants() {
        System.out.println("Number tenants: " + numberOfTenants);
    }
}
