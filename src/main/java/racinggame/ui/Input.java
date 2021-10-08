package racinggame.ui;

public class Input {

    public static final String CAR_NAME = "경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분)";
    public static final String TRY_COUNT = "시도할 횟수는 몇회인가요?";
    public static final String ERROR_INPUT_TRY_COUNT = "[ERROR] 시도할 횟수는 0 초과만 입력 가능합니다.";
    public static final String ERROR_INPUT_USER_NAME_MAX_LENGTH = "[ERROR] 자동차 이름은 5자까지만 가능합니다.";
    public static final String ERROR_INPUT_USER_NAME_EMPTY = "[ERROR] 자동차 이름을 입력해야합니다.";

    public static void errorInputUserNameMaxLength() {
        System.out.println(ERROR_INPUT_USER_NAME_MAX_LENGTH);
    }

    public static void errorInputUserNameEmpty() {
        System.out.println(ERROR_INPUT_USER_NAME_EMPTY);
    }

    public static void errorInputTryCount() {
        System.out.println(ERROR_INPUT_TRY_COUNT);
    }

    public static void tryCount() {
        System.out.println(TRY_COUNT);
    }

    public static void carName() {
        System.out.println(CAR_NAME);
    }
}
