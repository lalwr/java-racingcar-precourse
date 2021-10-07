package racinggame.domain;

import nextstep.utils.Console;
import racinggame.ui.Input;

public class Car {
    private final int MAX_LENGTH = 5;

    private String carName;

    public Car(String carName) {
        this.carName = carName;
        valid();
    }

    private void valid() {
        validEmptyName();
        validNameLength();
    }

    private void validEmptyName() {
        if (this.carName.trim().equals("")) {
            Input.errorInputUserNameEmpty();
            reUserInputName();
        }
    }

    private void validNameLength() {
        if (this.carName.length() > MAX_LENGTH) {
            Input.errorInputUserNameMaxLength();
            reUserInputName();
        }
    }

    private void reUserInputName(){
        this.carName = Console.readLine();
        valid();
    }

    public String getCarName() {
        return carName;
    }
}
