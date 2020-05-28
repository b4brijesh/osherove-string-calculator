import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {

    @Test
    public void add_emptyString_ReturnsZero() {
        StringCalculator stringCalculator = new StringCalculator(); // arrange

        int result = stringCalculator.add(""); // act

        assertEquals(0, result, "Empty string should return zero."); // assert
    }

    @Test
    public void add_oneNumber_returnsSameNumber() {
        StringCalculator stringCalculator = new StringCalculator();

        int result = stringCalculator.add("1");

        assertEquals(1, result);
    }

    @Test
    public void add_twoCommaSeparatedNumber_returnsSum() {
        StringCalculator stringCalculator = new StringCalculator();

        int result = stringCalculator.add("1,2");

        assertEquals(3, result);
    }
}
