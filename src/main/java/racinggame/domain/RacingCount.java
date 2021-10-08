package racinggame.domain;

import nextstep.utils.Console;
import racinggame.ui.Input;

public class RacingCount {
    private static final int NO_RACING = 0;

    private int racingCount;

    public RacingCount() {
        Input.tryCount();
        settingCount();
    }

    private void valid() {
        if (this.racingCount == NO_RACING) {
            Input.errorInputTryCount();
            settingCount();
        }
    }

    private void settingCount() {
        this.racingCount = Integer.parseInt(Console.readLine());
        valid();
    }

    public int getRacingCount() {
        return racingCount;
    }
}
