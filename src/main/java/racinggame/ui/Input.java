package racinggame.ui;

public class Input {

    public static final String ERROR_INPUT_USER_NAME_MAX_LENGTH = "[ERROR] 자동차 이름은 5자까지만 가능합니다.";
    public static final String ERROR_INPUT_USER_NAME_EMPTY = "[ERROR] 자동차 이름을 입력해야합니다.";

    public static void errorInputUserNameMaxLength() {
        System.out.println(ERROR_INPUT_USER_NAME_MAX_LENGTH);
    }

    public static void errorInputUserNameEmpty() {
        System.out.println(ERROR_INPUT_USER_NAME_EMPTY);
    }
}
