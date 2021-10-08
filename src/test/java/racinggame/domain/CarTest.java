package racinggame.domain;

import nextstep.test.NSTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CarTest extends NSTest {

    @BeforeEach
    void beforeEach() {
        setUp();
    }

    @Test
    @DisplayName("자동차_이름_5자리_초과")
    void 자동차_이름_5자리_초과() {
        Car car = new Car("pobi56");
        assertTrue(car.valid());
    }

    @Test
    @DisplayName("자동차_이름_5자리_이하")
    void 자동차_이름_5자리_이하() {
        Car car = new Car("pobi5");
        assertFalse(car.valid());
    }

    @Test
    @DisplayName("자동차_입력안했을때")
    void 자동차_입력안했을때() {
        Car car = new Car("");
        assertTrue(car.valid());
    }

    @AfterEach
    void tearDown() {
        outputStandard();
    }

    @Override
    protected void runMain() {
    }
}