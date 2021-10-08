package racinggame.racing;

import nextstep.utils.Randoms;

public class Run {
    private static final int MIN_NUMBER = 0;
    private static final int MAX_NUMBER = 9;
    private static final int RUN_COUNT = 4;

    private int runCount;

    public Run() {
        this.runCount = Randoms.pickNumberInRange(MIN_NUMBER, MAX_NUMBER);
    }

    public boolean isRunning() {
        if (runCount >= RUN_COUNT) {
            return true;
        }
        return false;
    }
}
