package racinggame.domain;

import racinggame.ui.Output;

import java.util.ArrayList;
import java.util.List;

public class Winner {
    private static final int MAX_RUNNING = 0;

    List<Car> cars;
    List<String> winners;
    int maxRunning;

    public Winner(List<Car> cars) {
        this.cars = cars;
        this.winners = new ArrayList<>();
        maxRunning = MAX_RUNNING;
        maxRunning();
        result();
    }

    private void maxRunning() {
        for (Car car : cars) {
            maxRunning(car.getRunCount());
        }
    }

    private void maxRunning(int runCount) {
        if (this.maxRunning < runCount) {
            this.maxRunning = runCount;
        }
    }

    public void result() {
        for (Car car : cars) {
            winner(car, maxRunning);
        }
    }

    private void winner(Car car, int maxRunning) {
        if (car.winner(maxRunning)) {
            winners.add(car.getCarName());
        }
    }

    public void outPut() {
        Output.winner(String.join(",", winners));
    }

}
