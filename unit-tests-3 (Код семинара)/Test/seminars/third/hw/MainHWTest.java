package seminars.third.hw;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

public class MainHWTest {
    private MainHW mainHW;

    @BeforeEach
    void setUp() {
        mainHW = new MainHW();
    }

    @Test
    public void testEvenOddNumberTrue() {
        boolean isEven = mainHW.evenOddNumber(8);
        Assertions.assertTrue(isEven);
    }

    @Test
    public void testEvenOddNumberFalse() {
        boolean isEven = mainHW.evenOddNumber(9);
        Assertions.assertFalse(isEven);
    }

    @Test
    void numberInIntervalFrom25to100True() {
        boolean isInInterval = mainHW.numberInInterval(68);
        Assertions.assertTrue(isInInterval);
    }

    @Test
    void numberInIntervalLessThan25False() {
        boolean isInInterval = mainHW.numberInInterval(1);
        Assertions.assertFalse(isInInterval);
    }

    @Test
    void numberInIntervalMoreThan100False() {
        boolean isInInterval = mainHW.numberInInterval(222);
        Assertions.assertFalse(isInInterval);
    }
}
