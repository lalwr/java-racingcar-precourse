package racinggame.domain;

import racinggame.ui.Output;

public class Result {
    private String carName;
    private int runCount;

    public Result(String carName, int runCount) {
        this.carName = carName;
        this.runCount = runCount;
    }

    public void outPut() {
        Output.carName(carName);
        Output.runStatus(runCount);
    }

}
