package StringCalculator;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class StringCalculatorTest {
    StringCalculator stringCalculator = new StringCalculator();

    @Test
    public void splitAndSumTest() {
        String userInput = "1,2,3";
        int summedUserInput = stringCalculator.splitAndSum(userInput);
        assertThat(summedUserInput).isEqualTo(6);
    }

    @Test
    public void returnZeroTest() {
        String userInput = "";
        int summedUserInput = stringCalculator.splitAndSum(userInput);
        assertThat(summedUserInput).isEqualTo(0);
    }

    @Test
    public void returnNumberTest() {
        String userInput = "1";
        StringCalculator stringCalculator = new StringCalculator();
        int result = stringCalculator.splitAndSum(userInput);
        assertThat(result).isEqualTo(1);
    }

    @Test
    public void splitAndSumColon() {
        String userInput = "1;2;3";
        int summedUserInput = stringCalculator.splitAndSum(userInput);
        assertThat(summedUserInput).isEqualTo(6);
    }

    @Test
    public void splitAndSumCustomSeparator() {
        String userInput = "//;\n1;2;3";
        int summedUserInput = stringCalculator.splitAndSum(userInput);
        assertThat(summedUserInput).isEqualTo(6);
    }

    @Test
    public void throwRuntimeErrorExceptionTest() {
        String userInput = "-1,2,3";
        int summedUserInput = stringCalculator.splitAndSum(userInput);
        assertThat(summedUserInput).isEqualTo(RuntimeException.class);
    }
}
