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

    @DisplayName("숫자 하나가 문자열로 들어왔을 때 해당 숫자를 반환하는 기능 테스트")
    @Test
    public void returnJustIntTest() {
        Calculator calculator = new Calculator();
        String userInput = "1";

        int intUserInput = calculator.returnJustIntNum(userInput);
        assertThat(intUserInput).isEqualTo(1);
    }

    @DisplayName("커스텀 구분자로 더하는 기능 테스트")
    @Test
    public void customAdditionTest() {
        String userInput = "//;\n1;2;3";
        Calculator calculator = new Calculator();
        int summedUserInput = calculator.doCustomSeparatorAddition(userInput);
        assertThat(summedUserInput).isEqualTo(6);
    }
}
