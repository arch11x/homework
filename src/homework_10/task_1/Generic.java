package homework_10.task_1;

public class Generic<T> {
    private T ob;

    Generic(T o) {
        ob = o;
    }

    T getOb() {
        return ob;
    }

    void showType() {
        System.out.println("Type T: " + ob.getClass().getName());
    }

    public static void main(String[] args) {
        Generic<Integer> iOb;
        iOb = new Generic<>(141);
        iOb.showType();
        int value = iOb.getOb();
        System.out.println("Mean: " + value);
        Generic<String> strOb = new Generic<>("generalized text");
        strOb.showType();
        String str = strOb.getOb();
        System.out.println("Mean: " + str);
    }
}
