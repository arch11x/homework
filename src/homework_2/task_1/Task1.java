package homework_2.task_1;

public class Task1 {
    public static void main(String[] args) {
        double km = 10;
        int days = 7;
        for ( int i = 0; i < days; i++) {
            km = km + (km * 0.1);
        }
        System.out.println("Total amount: "+ km + " km");
    }
}
