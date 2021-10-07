package racinggame.domain;

import racinggame.ui.Input;

public class User {
    private final int MAX_LENGTH = 5;

    private String user;

    public User(String user) {
        this.user = user;
        validNameLength();
    }

    private void validNameLength() {
        if (this.user.length() > MAX_LENGTH) {
            Input.errorInputUserNameMaxLength();
        }
    }
}
