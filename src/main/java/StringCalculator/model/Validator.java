package StringCalculator.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Validator {
    public static void validateIsInputContainsOnlyPositiveInteger(List<String> userInput) {
        Calculator calculator = new Calculator();
        for (String arr: userInput) {
            if (!arr.matches("\\d")) {
                throw new RuntimeException("구분자 사이에는 양의 정수만 입력해주세요.");
            }
        }
    }
}
