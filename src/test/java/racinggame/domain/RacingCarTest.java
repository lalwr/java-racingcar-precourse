package racinggame.domain;

import nextstep.test.NSTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racinggame.ApplicationTest;

class RacingCarTest extends NSTest {

    @BeforeEach
    void beforeEach() {
        setUp();
    }

    @Test
    @DisplayName("자동차_정상_셋팅")
    void 자동차_정상_셋팅() {
        run("pobi,woni");
        notVerify(ApplicationTest.ERROR_MESSAGE);
    }

    @Test
    @DisplayName("자동차_셋팅_6자리포함")
    void 자동차_셋팅_6자리포함() {
        run("pobi,woni12,wibj", "wonj");
        verify(ApplicationTest.ERROR_MESSAGE);
    }

    @AfterEach
    void tearDown() {
        outputStandard();
    }

    @Override
    protected void runMain() {
        new RacingCar();
    }
}