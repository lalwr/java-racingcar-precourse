package racinggame.domain;

import racinggame.racing.Run;
import racinggame.ui.Input;

public class Car {
    private static final int MAX_LENGTH = 5;
    private static final int DEFAULT_RUN_COUNT = 0;

    private String carName;
    private int runCount;

    public Car(String carName) {
        this.carName = carName;
        this.runCount = DEFAULT_RUN_COUNT;
    }

    public boolean valid() {
        if(validEmptyName() || validNameLength()) {
            return true;
        }
        return false;
    }

    private boolean validEmptyName() {
        if (this.carName.trim().equals("")) {
            Input.errorInputUserNameEmpty();
            return true;
        }
        return false;
    }

    private boolean validNameLength() {
        if (this.carName.length() > MAX_LENGTH) {
            Input.errorInputUserNameMaxLength();
            return true;
        }
        return false;
    }

    public void running() {
        Run run = new Run();
        if (run.isRunning()){
            this.runCount++;
        }
    }

    public void finish() {
        Result result = new Result(carName, runCount);
        result.outPut();
    }

    public int getRunCount() {
        return runCount;
    }

    public String getCarName() {
        return carName;
    }

    public boolean winner(int maxRunning) {
        if (runCount >= maxRunning) {
            return true;
        }
        return false;
    }
}
