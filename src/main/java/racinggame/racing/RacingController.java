package racinggame.racing;

import racinggame.domain.RacingCount;
import racinggame.ui.Output;

public class RacingController {
    RacingCar racingCar;
    RacingCount racingCount;

    public void start() {
        this.racingCar = new RacingCar();
        racingRun();
        finish();
        winner();
    }

    private void racingRun() {
        this.racingCount = new RacingCount();
        int count = this.racingCount.getRacingCount();

        for (int i = 0; i < count; i++) {
            this.racingCar.run();
        }
    }

    private void finish() {
        Output.result();
        for (int i = 0; i < this.racingCount.getRacingCount(); i++) {
            racingCar.finish();
        }
    }

    private void winner() {
        racingCar.winner();
    }
}
