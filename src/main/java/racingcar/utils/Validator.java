package racingcar.utils;

import racingcar.model.Car;

import java.util.List;

public class Validator {
    private static final String VALIDATE_DELIMITER_MASSAGE = "자동차의 이름은 콤마(,)로 구분해주세요.";
    private static final String NAME_VALIDATE_MASSAGE = "자동차의 이름은 1-5자 이어야 합니다.";
    private static final String COUNTS_OF_CARS_VALIDATE_MASSAGE = "자동차 개수는 1개 이상으로 설정해주세요.";
    private static final String COUNT_VALIDATE_MASSAGE = "시도 회수는 숫자만 입력 가능합니다.";
    public void validateName(String name) throws IllegalArgumentException {
        String[] nameList = name.split(",");
        for (String carName : nameList) {
            if (carName.length() < 1 | carName.length() > 5) {
                throw new IllegalArgumentException(NAME_VALIDATE_MASSAGE);
            }
        }
    }

    public void validateDelimiter(String userInput) throws IllegalArgumentException {
        if (!userInput.contains(",")) {
            throw new IllegalArgumentException(VALIDATE_DELIMITER_MASSAGE);
        }
    }

    public void validateCarNumbers(String userInput) throws IllegalArgumentException {
        String[] carList = userInput.split(",");
        if (carList.length < 1) {
            throw new IllegalArgumentException(COUNTS_OF_CARS_VALIDATE_MASSAGE);
        }
    }

    public void validateCount(String userInput) throws IllegalArgumentException {
        for (int i = 0; i < userInput.length(); i++) {
            if (!Character.isDigit(userInput.charAt(i))) {
                throw new IllegalArgumentException(COUNT_VALIDATE_MASSAGE);
            }
        }
    }
}
