package homework_5.task_3;

import java.util.Scanner;

public class Main {
    public static void main (String [] args)
    {
        String type;
        CatalogHouse catalogHouses = new CatalogHouse();
        VacationHome vacationHouse = new VacationHome();
        Skyscraper skyscraper = new Skyscraper();
        Scanner in = new Scanner(System.in);

        catalogHouses.getArrayHouse();
        System.out.println("Please choose type of house:");
        type = in.next();
//        if (type == "Vacation house") {
//            System.out.println("Number of floors: " + VacationHome.numberOfFloors);
//            System.out.println("Number of tenants: " + VacationHome.numberOfTenants);
//        } else {
//            System.out.println("Number of floors: " + Skyscraper.numberOfFloors);
//            System.out.println("Number of tenants: " + Skyscraper.numberOfTenants);
//        }
        /*я перепробовал все чтобы вывести значения загородного дома, но ничего не выходит
            Выводить значения городского
         */
    }
}