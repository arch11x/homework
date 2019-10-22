package homework_5.task_3;

public class CatalogHouse {
    private String [] arrayHouse = new String [2];

    public CatalogHouse()
    {
        arrayHouse[0] = "Vacation house";
        arrayHouse[1] = "Skyscraper";
    }
    public void getArrayHouse() {
        for (int i=0; i< arrayHouse.length; i ++)
        {
            System.out.println("Type houses: " + arrayHouse[i].toString());
        }
    }
}