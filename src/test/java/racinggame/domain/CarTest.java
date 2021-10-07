package racinggame.domain;

import nextstep.test.NSTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class CarTest extends NSTest {

    private static final String ERROR_MESSAGE = "[ERROR]";

    @BeforeEach
    void beforeEach() {
        setUp();
    }

    @Test
    @DisplayName("유저_이름_5자리_초과")
    void 유저_이름_5자리_초과() {
        run("pobi");
        new Car("pobi56");
        verify(ERROR_MESSAGE);
    }

    @Test
    @DisplayName("유저_이름_5자리_이하")
    void 유저_이름_5자리_이하() {
        new Car("pobi5");
        notVerify(ERROR_MESSAGE);
    }

    @Test
    @DisplayName("유저_입력안했을때")
    void 유저_입력안했을때() {
        run("pobi");
        new Car("");
        verify(ERROR_MESSAGE);
    }

    @AfterEach
    void tearDown() {
        outputStandard();
    }

    @Override
    protected void runMain() {
    }
}