package homework_5.task_3;

public class Skyscraper implements Interface {

    static int numberOfTenants;
    static int numberOfFloors;
    String type;

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

    }

    @Override
    public void getNumberOfTenants() {
        System.out.println("Number tenants: " + numberOfTenants);
    }
}