package homework_5.task_3;

// поля класса должны быть приватными
public class VacationHome implements Interface {

    // думаю это поле не должно быть статичным
    static int numberOfTenants;
    // думаю это поле не должно быть статичным
    static int numberOfFloors;
    String type;

    // сделай лучше конструктор с аргументами
    public VacationHome () {
        numberOfFloors = 3;
        numberOfTenants = 4;
        type = "Vacation home";
    }

    @Override
    public void turnOnTheHeating()
    {
        System.out.println("Turn on the heating");
    }

    @Override
    public void getNumberOfTenants()
    {
        System.out.println("Number tenants: " + numberOfTenants);
    }

    @Override
    public void getNumberOfFloors()
    {
        System.out.println("Number floors: "+ numberOfFloors);
    }

// пустая строка не нужна
// пустая строка не нужна
}
