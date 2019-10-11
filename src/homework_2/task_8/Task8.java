package homework_2.task_8;

public class Task8 {
    public static void main(String[] args) {
        int even = 0;
        int odd = 0;
        int all = 0;

        for (int i = 0; i <= 100; i++) {
            if (i % 2 == 0) {
                even += i;
            }else {
                odd+=i;
            }
            // сумму всех можно посчитать 1 раз за пределами цикла, сложив чет+нечет
            all+=i;
        }
        System.out.println("Сумма всех четных = " + even);
        System.out.println("Сумма всех нечетных = " + odd);
        System.out.println("Сумма всех чисел = " + all);
    }
}
