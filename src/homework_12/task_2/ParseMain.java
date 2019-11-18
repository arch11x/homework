package homework_12.task_2;

public class ParseMain {
    public static void main(String[] args) {
        Parse parse = integer -> integer + " RUB";
        String result = show(parse, 1000000);
        System.out.println(result);
    }

    private static String show(Parse parse, int value) {
        return parse.show(value);
    }
}
