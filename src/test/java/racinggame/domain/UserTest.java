package racinggame.domain;

import nextstep.test.NSTest;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class UserTest extends NSTest {

    private static final String ERROR_MESSAGE = "[ERROR]";

    @BeforeEach
    void beforeEach() {
        setUp();
    }

    @Test
    @DisplayName("유저_이름_5자리_초과")
    void 유저_이름_5자리_초과() {
        User user = new User("aaacar");
        verify(ERROR_MESSAGE);
    }

    @Override
    protected void runMain() {

    }
}