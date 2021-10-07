package racinggame.domain;

import nextstep.utils.Console;
import racinggame.ui.Input;

public class User {
    private final int MAX_LENGTH = 5;

    private String user;

    public User() {
        this.user = Console.readLine();
        valid();
    }

    private void valid() {
        validEmptyName();
        validNameLength();
    }

    private void validEmptyName() {
        if (this.user.trim().equals("")) {
            Input.errorInputUserNameMaxLength();
            reUserInputName();
        }
    }

    private void validNameLength() {
        if (this.user.length() > MAX_LENGTH) {
            Input.errorInputUserNameEmpty();
            reUserInputName();
        }
    }

    private void reUserInputName(){
        this.user = Console.readLine();
        valid();
    }
}
