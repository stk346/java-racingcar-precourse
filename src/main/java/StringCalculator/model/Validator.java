package StringCalculator.model;

import java.util.Arrays;

public class Validator {
    public void validateIsInputContainsOnlyPositiveInteger(String[] userInput) {
        Calculator calculator = new Calculator();
        for (String arr: userInput) {
            if (!arr.matches("[+]?\\d")) {
                throw new RuntimeException("구분자 사이에는 양의 정수만 입력해주세요.");
            }
        }
    }
}
