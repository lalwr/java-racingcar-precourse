package racinggame.domain;

import nextstep.test.NSTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racinggame.ApplicationTest;

class CarTest extends NSTest {

    @BeforeEach
    void beforeEach() {
        setUp();
    }

    @Test
    @DisplayName("자동차_이름_5자리_초과")
    void 자동차_이름_5자리_초과() {
        run("pobi");
        new Car("pobi56");
        verify(ApplicationTest.ERROR_MESSAGE);
    }

    @Test
    @DisplayName("자동차_이름_5자리_이하")
    void 자동차_이름_5자리_이하() {
        new Car("pobi5");
        notVerify(ApplicationTest.ERROR_MESSAGE);
    }

    @Test
    @DisplayName("자동차_입력안했을때")
    void 자동차_입력안했을때() {
        run("pobi");
        new Car("");
        verify(ApplicationTest.ERROR_MESSAGE);
    }

    @AfterEach
    void tearDown() {
        outputStandard();
    }

    @Override
    protected void runMain() {
    }
}