package racing;

import java.util.Random;

public class RandomRule implements MovingRule{
    private static final int RANDOM_BOUND = 9;
    private static final int TARGET_NUMBER = 4;
    private final Random random = new Random();

    @Override
    public boolean isPossibleToMove() {
        return doesRandomNumberAboveTargetNumber();
    }

    private boolean doesRandomNumberAboveTargetNumber() {
        return random.nextInt(RANDOM_BOUND) >= TARGET_NUMBER;
    }
}
