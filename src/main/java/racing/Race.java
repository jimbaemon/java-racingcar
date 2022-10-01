package racing;

import java.util.ArrayList;
import java.util.List;

public class Race {

    private final List<Car> cars = new ArrayList<>();
    private final ScoreBoard scoreBoard = new ScoreBoard();
    private final int play;

    public Race(final int numberOfCars, final int numberOfPlays, final MovingRule movingRule) {
        for (int i = 0; i < numberOfCars; i++) {
            this.cars.add(createCar(movingRule));
        }
        this.play = numberOfPlays;
    }

    public void play() {
        for (int i = 0; i < play; i++) {
            run();
        }
    }

    private void run() {
        RaceResult result = new RaceResult();
        for (Car car : cars) {
            car.move();
            result.addCarLocation(car.location());
        }
        scoreBoard.addResult(result);
    }

    private Car createCar(MovingRule movingRule) {
        return new Car(movingRule);
    }

    public ScoreBoard result() {
        return scoreBoard;
    }
}
