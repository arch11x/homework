package homework_5.task_3;

public class VacationHome implements Interface {

    static int numberOfTenants;
    static int numberOfFloors;
    String type;

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



}