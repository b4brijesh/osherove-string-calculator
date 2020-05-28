import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringCalculatorTest {

    @Test
    public void add_emptyString_ReturnsZero() {
        StringCalculator stringCalculator = new StringCalculator(); // arrange

        int result = stringCalculator.add(""); // act

        assertEquals(0, result, "Empty string should return zero.");
    }
}
