package homework_6.task_2;

public class Tran {
    private int numberOfGear;
    private static final int GEARS_TRANSMISSION = 7;

    public int getNumberOfGear() {
        return numberOfGear;
    }

    public void changeGearUp() {
        if (numberOfGear < GEARS_TRANSMISSION) {
            numberOfGear++;
        }
        if (numberOfGear == GEARS_TRANSMISSION) System.out.println("7 gears");
    }

    public void changeGearDown() {
        if (numberOfGear == 7) {
            System.out.println("7 position");
        } else {
            numberOfGear--;
        }
    }
}

