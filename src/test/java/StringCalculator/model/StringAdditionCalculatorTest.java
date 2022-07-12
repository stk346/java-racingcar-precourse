package StringCalculator.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

public class StringAdditionCalculatorTest {
    @DisplayName("콤마(,) and 콜롱(:) 덧셈 수행 테스트")
    @Test
    public void commaAdditionTest() {
        String commaUserInput = "1,2,3";
        String colonUserInput = "1:2:3";
        Calculator calculator = new Calculator();

        int commaResult = calculator.doBasicAddition(commaUserInput);
        int colonResult = calculator.doBasicAddition(colonUserInput);
        assertThat(commaResult).isEqualTo(6);
        assertThat(colonResult).isEqualTo(6);
    }
}
