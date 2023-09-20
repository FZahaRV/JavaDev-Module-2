import org.junit.jupiter.api.*;

public class SumCalculatorTests {
    private SumCalculator calc;
    @BeforeEach
    public void beforeEach() {
        calc = new SumCalculator();
    }
    @Test
    public void testThatSumWorkCorrectWithOne() {
        int actual = calc.sum(1);
        Assertions.assertEquals(1, actual);
    }
    @Test
    public void testThatSumWorkCorrectWithTwo() {
        int actual = calc.sum(3);
        Assertions.assertEquals(6, actual);
    }
    @Test
    public void testThatSumWorkCorrectWithZero() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            calc.sum(0);
        });
    }

}
