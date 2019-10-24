package homework_5.task_2;

public class Warehouse {
    private final String[] array = new String[4];

    // массив лучше передавать аргументом
    public Warehouse() {
        array[0] = "shovel";
        array[1] = "rake";
        array[2] = "bucket";
        array[3] = "Earth";
    }

    // метод next не должен принимать аргументов, внутри класса должно быть поле, которое бы хранило состояние курсора (индекса)
    public void next(int next) {
        if (next == array.length - 1) {
            System.out.println("Следующий элемент: " + array[0].toString());
        } else {
            System.out.println("Следующий элемент: " + array[next].toString());
        }
    }

    // метод getArray() должен возвращать массив, а не быть void
    public void getArray() {
        for (int i = 0; i < array.length; i++) {
            System.out.println(" Элемент массива: " + array[i].toString());
        }
    }
}
