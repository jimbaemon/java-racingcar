package racing;

import java.util.Comparator;
import java.util.Random;

public class Car implements Comparator<Car> {
    private static final String ROAD = "-";

    private int location = 0;

    public void move() {
        if (isPossibleToMove()) {
            location++;
        }
    }

    private boolean isPossibleToMove() {
        Random random = new Random();
        return random.nextInt(9) >= 4;
    }

    @Override
    public int compare(Car o1, Car o2) {
        return Integer.compare(o1.location, o2.location);
    }

    public String location() {
        return ROAD.repeat(Math.max(0, location));
    }
}
