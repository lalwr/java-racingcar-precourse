package racinggame.domain;

import nextstep.test.NSTest;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import racinggame.ApplicationTest;

class RacingCountTest extends NSTest {

    @BeforeEach
    void beforeEach() {
        setUp();
    }

    @Test
    @DisplayName("레이싱횟수_제로")
    void 레이싱횟수_제로() {
        run("0", "1");
        verify(ApplicationTest.ERROR_MESSAGE);
    }

    @AfterEach
    void tearDown() {
        outputStandard();
    }

    @Override
    protected void runMain() {
        new RacingCount();
    }
}