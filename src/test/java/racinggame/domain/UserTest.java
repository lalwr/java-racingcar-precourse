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
        run("pobi56", "pobi");
        verify(ERROR_MESSAGE);
    }

    @Test
    @DisplayName("유저_이름_5자리_이하")
    void 유저_이름_5자리_이하() {
        run("pobi5");
        notVerify(ERROR_MESSAGE);
    }

    @Test
    @DisplayName("유저_입력안했을때")
    void 유저_입력안했을때() {
        run(" ", "pobi");
        verify(ERROR_MESSAGE);
    }

    @Override
    protected void runMain() {
        new User();
    }
}