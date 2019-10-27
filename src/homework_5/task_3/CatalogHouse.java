package homework_5.task_3;

// форматируй код
public class CatalogHouse {
    // массив передавай аргументом через конструктор
    // массив должен быть не строк, а домов
    // private House[] houses;
    private String [] arrayHouse = new String [2];

    // сделай конструктор с аргументами
    // (House[] houses)
    public CatalogHouse()
        // this.houses = houses;
    {
        arrayHouse[0] = "Vacation house";
        arrayHouse[1] = "Skyscraper";
    }
    // здесь нужен абзац
    public void getArrayHouse() {
        for (int i=0; i< arrayHouse.length; i ++)
        {
            System.out.println("Type houses: " + arrayHouse[i].toString());
        }
    }
}
